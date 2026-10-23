package modul4.soal2;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        menu();
    }
    static void menu(){
        Boolean isMenu = true;
        while (isMenu){
            System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
            System.out.println("1 = Kucing");
            System.out.println("2 = Anjing");
            System.out.print("Masukkan Pilihan: ");
            try {
                Integer input = Integer.parseInt(scanner.nextLine().trim());
                switch (input){
                    case 1:
                        buatKucing();
                        break;
                    case 2:
                        buatAnjing();
                        break;
                    default:
                        isMenu = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
            System.out.println();
        }
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
    private static String[] validasi_array_string(){
        while (true){
            Boolean isEmpty = false;
            System.out.print("Kemampuan: ");
            String[] input = scanner.nextLine().trim().split(",");
            for (int i = 0; i < input.length; i++){
                if (input[i].isEmpty()) {
                    isEmpty = true;
                    break;
                }
            }
            if (isEmpty){
                System.out.println("Kemampuan ada yang kosong");
            } else {
                return input;
            }
        }
    }
    static void buatKucing(){
        String nama = validasi_string("Nama hewan Peliharaan");
        String ras = validasi_string("Ras");
        String warnaBulu = validasi_string("Warna Bulu");
        Kucing kucing = new Kucing(nama, ras, warnaBulu);
        kucing.displayDetailKucing();
    }
    static void buatAnjing(){
        String nama = validasi_string("Nama hewan Peliharaan");
        String ras = validasi_string("Ras");
        String warnaBulu = validasi_string("Warna Bulu");
        String[] kemampuan = validasi_array_string();
        Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
        anjing.displayDetailAnjing();
    }
}
