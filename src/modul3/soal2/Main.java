package modul3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        LinkedList <Negara> list_negara = new LinkedList<Negara>();
        Map<Integer, String> data_bulan = new HashMap<>() {{
            put(1, "Januari");   put(2, "Februari"); put(3, "Maret");
            put(4, "April");      put(5, "Mei");      put(6, "Juni");
            put(7, "Juli");       put(8, "Agustus");  put(9, "September");
            put(10, "Oktober");   put(11, "November");put(12, "Desember");
        }};

        int jumlah_negara = validasiAngka("Jumlah Negara", 1, 9999);
        for (int i = 0; i < jumlah_negara; i++){
            String nama = validasi_string("Nama");
            String jenis_kepemimpinan = validasi_string("Jenis Kepemimpinan");
            String nama_pemimpin = validasi_string("Nama Pemimpin");
            if (!jenis_kepemimpinan.equalsIgnoreCase("monarki")){
                int[] kalender = getDataKalender();
                int tanggal = kalender[0];
                int bulan = kalender[1];
                int tahun = kalender[2];
                String nama_bulan = data_bulan.get(bulan);
                Negara negara = new Negara(nama, jenis_kepemimpinan, nama_pemimpin, tanggal, nama_bulan, tahun);
                list_negara.add(negara);
            } else {
                Negara negara = new Negara(nama, jenis_kepemimpinan, nama_pemimpin);
                list_negara.add(negara);
            }
            System.out.print("\n");
        }
        for (int i = 0; i< list_negara.size(); i++){
            System.out.print("\n");
            list_negara.get(i).getInfo();
        }
    }

    private static String validasi_string(String judul){
        while (true){
            System.out.print("Masukkan " + judul + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()){
                return input;
            }
            System.out.println(judul + " tidak boleh kosong!");
        }
    }
    private static Integer validasiAngka(String judul, int min, int max){
        while (true){
            System.out.print("Masukkan "+ judul + ": ");
            try {
                int angka = Integer.parseInt(scanner.nextLine().trim());
                if (angka >= min && angka <= max){
                    return angka;
                }
                System.out.println(judul + " harus berada antara rentang" + min + "-" + max);
            } catch (NumberFormatException e){
                System.out.println("Input harus berupa angka!");
            }
        }
    }
    public static boolean apakahTanggalValid(int tanggal, int bulan, int tahun){
        int makshari = 31;
        switch (bulan){
            case 4: case 6: case 9: case 11:
                makshari = 30;
                break;
            case 2:
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    makshari = 29;
                } else {
                    makshari = 28;
                }
                break;
        }
        return tanggal <= makshari;
    }
    public static int[] getDataKalender(){
        while (true){
            int tanggal = validasiAngka("Tanggal Kemerdekaan", 1, 31);
            int bulan = validasiAngka("Bulan Kemerdekaan", 1, 12);
            int tahun = validasiAngka("Tahun Kemerdekaan", 1500, 2026);

            if (apakahTanggalValid(tanggal, bulan, tahun)){
                return new int[]{tanggal, bulan, tahun};
            } else {
                System.out.println("Kombinasi tanggal bulan dan tahun tidak valid!\n");
            }
        }
    }
}
