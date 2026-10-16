package modul4.soal1;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        String nama = validasi_string("Nama Hewan Peliharaan");
        String ras = validasi_string("Ras");
        HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(nama, ras);
        hewanPeliharaan.display();
    }

    private static String validasi_string(String pesan){
        while (true){
            System.out.print(pesan + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()){
                return input;
            }
            System.out.println(pesan + " tidak boleh kosong");
        }
    }
}