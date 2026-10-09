package modul3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Mahasiswa> list_mahasiswa = new ArrayList<Mahasiswa>();

    public static void main(String[] args){
        menu();
    }

    public static void menu(){
        boolean jalan = true;
        while (jalan){
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            Integer menu = validasiInputInteger("Pilihan");
            switch (menu){
                case 0:
                    jalan = false;
                    break;
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa(validasiInputString("Masukkan NIM"));
                    break;
                case 3:
                    cariMahasiswa(validasiInputString("Masukkan NIM"));
                    break;
                case 4:
                    tampilkanMahasiswa();
                    break;
            }
        }
    }

    public static Integer validasiInputInteger(String pesan){
        while (true){
            try {
                System.out.print(pesan+ ": ");
                int input = Integer.parseInt(scanner.nextLine().trim());
                return input;
            } catch (NumberFormatException e){
                System.out.println(pesan+" harus berupa angka!");
            }
        }
    }

    public static String validasiInputString(String pesan){
        System.out.print(pesan+ ": ");
        return scanner.nextLine().trim();
    }

    public static void tambahMahasiswa(){
        String nama = validasi_string();
        String nim = validasi_nim();
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        list_mahasiswa.add(mahasiswa);
    }

    public static void hapusMahasiswa(String nim){
        if (list_mahasiswa.removeIf(mahasiswa -> mahasiswa.getNim().equals(nim))){
            System.out.print("Mahasiswa dengan NIM" + nim + "dihapus\n");
        }else {
            System.out.print("Mahasiswa dengan NIM" + nim + "tidak dihapus!\n");
        }
    }

    public static void cariMahasiswa(String nim){
        Mahasiswa mhs = list_mahasiswa.stream().filter(mahasiswa -> mahasiswa.getNim().equals(nim)).findFirst().orElse(null);
        if (mhs!=null){
            System.out.println("NIM  :" + mhs.getNim());
            System.out.println("Nama :"+ mhs.getNama());
        } else {
            System.out.println("NIM tidak ditemukan");
        }
    }

    public static void tampilkanMahasiswa(){
        for (Mahasiswa m : list_mahasiswa){
            System.out.println("NIM : " + m.getNim()+", Nama: "+ m.getNama());
        }
    }

    private static String validasi_string(){
        while (true){
            System.out.print("Masukkan Nama Mahasiswa: ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()){
                return input;
            }
            System.out.println("Nama tidak boleh kosong!");
        }
    }

    private static String validasi_nim(){
        while (true){
            System.out.print("Masukkan NIM Mahasiswa: ");
            String input = scanner.nextLine().trim();
            boolean isNIMExist = list_mahasiswa.stream().anyMatch(mahasiswa -> mahasiswa.getNim().equals(input));
            if (isNIMExist){
                System.out.print("NIM sudah dipakai!");
            }else {
                return input;
            }
        }
    }
}