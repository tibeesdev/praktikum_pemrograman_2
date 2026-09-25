import java.util.Scanner;

public class PRAK101_2510817210027_Ahmad_Tibrizi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama = getNama(input);
        String tempatlahir = getTempatLahir(input);
        int[] datakalender = getDataKalender(input);
        int tanggal = datakalender[0];
        String bulan = getNamaBulan(datakalender[1]);
        int tahun = datakalender[2];
        int tinggibadan = getTinggiBadan(input);
        double beratbadan = getBeratBadan(input);
        System.out.println("Nama Lengkap " + nama + ", Lahir di "+ tempatlahir+" pada Tanggal "+ tanggal + " " + bulan +" "+ tahun +" Tinggi Badan " + tinggibadan + " cm dan Berat Badan " + beratbadan +" kilogram");
    }
    public static String getNama(Scanner input){
        while (true){
            System.out.print("Masukkan Nama Lengkap: ");
            String nama = input.nextLine().trim();
            if (nama.isEmpty()){
                System.out.print("Nama tidak boleh kosong!\n");
                continue;
            } else if (nama.matches("^[a-zA-Z\\s]+$")) {
                return nama;
            } else {
                System.out.print("Nama hanya boleh berisi huruf!\n");
            }
        }
    }
    public static String getTempatLahir(Scanner input){
        while (true){
            System.out.print("Masukkan Tempat Lahir: ");
            String tempatlahir = input.nextLine().trim();

            if (tempatlahir.isEmpty()){
                System.out.print("Tempat Lahir tidak boleh kosong!\n");
                continue;
            } else if (tempatlahir.matches("^[a-zA-Z\\s]+$")) {
                return tempatlahir;
            } else {
                System.out.print("Tempat Lahir hanya boleh berisi huruf!\n");
            }
        }
    }
    public static int validasiAngka(Scanner input, String tipe, int min, int max){
        while (true){
            System.out.print("Masukkan " + tipe + " Lahir: ");
            try {
                int angka = Integer.parseInt(input.nextLine().trim());
                if (angka >= min && angka <= max){
                    return angka;
                }
                System.out.print("Angka harus berada antara "+min + " sampai "+ max + "!\n");
            } catch (NumberFormatException e){
                System.out.print(tipe + " harus berupa angka!\n");
            }
        }
    }
    public static int[] getDataKalender(Scanner input){
        while (true){
            int tanggal = validasiAngka(input, "tanggal", 1, 31);
            int bulan = validasiAngka(input, "bulan", 1, 12);
            int tahun = validasiAngka(input, "tahun", 1500, 2026);

            if (apakahTanggalValid(tanggal, bulan, tahun)){
                return new int[]{tanggal, bulan, tahun};
            } else {
                System.out.println("Kombinasi tanggal, bulan dan tahun tidak valid!\n");
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

    public static String getNamaBulan(int bulan) {
        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return namaBulan[bulan];
    }
    public static int getTinggiBadan(Scanner input) {
        while (true) {
            System.out.print("Masukkan Tinggi Badan: ");
            String tinggibadan = input.nextLine().trim();

            if (tinggibadan.isEmpty()) {
                System.out.println("Tinggi badan tidak boleh kosong!\n");
                continue;
            }
            try {
                int intTinggi = Integer.parseInt(tinggibadan);
                if (intTinggi < 50 || intTinggi > 250) {
                    System.out.println("Tinggi badan harus berada dalam rentang 50 - 250 cm!\n");
                    continue;
                }
                return intTinggi;
            } catch (NumberFormatException e) {
                System.out.println("Tinggi badan harus berupa angka!\n");
            }
        }
    }
    public static double getBeratBadan(Scanner input) {
        while (true) {
            System.out.print("Masukkan Berat Badan: ");
            String beratBadan = input.nextLine().trim();
            if (beratBadan.isEmpty()) {
                System.out.println("Berat badan tidak boleh kosong!\n");
                continue;
            }
            try {
                beratBadan = beratBadan.replace(',', '.');
                double doubleBerat = Double.parseDouble(beratBadan);
                if (doubleBerat <= 0) {
                    System.out.println("Berat badan tidak boleh 0!\n");
                    continue;
                }
                return doubleBerat;
            } catch (NumberFormatException e) {
                System.out.println("Berat badan harus berupa angka!\n");
            }
        }
    }
}
