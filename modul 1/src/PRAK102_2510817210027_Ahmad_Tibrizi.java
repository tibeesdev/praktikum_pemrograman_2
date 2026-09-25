import java.util.Scanner;

public class PRAK102_2510817210027_Ahmad_Tibrizi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int batas = 10;
        int angkaAwal = validasiInput(input);

        while (i <= batas){
            int angkabaru = angkaAwal+i;
            int hasil;
            if (angkabaru % 5 == 0){
                hasil = (angkabaru/5) - 1;
            } else {
                hasil = angkabaru;
            }
            System.out.print(hasil);

            if (i < batas){
                System.out.print(", ");
            }
            i++;
        }
    }

    public static int validasiInput(Scanner input){
        while (true){
            try {
                System.out.print("Masukkan angka: ");
                int angka = Integer.parseInt(input.nextLine().trim());
                return angka;

            } catch (NumberFormatException e){
                System.out.println("Input harus berupa angka!");
            }
        }
    }
}
