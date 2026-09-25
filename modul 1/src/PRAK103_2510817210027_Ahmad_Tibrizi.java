import java.util.Scanner;

public class PRAK103_2510817210027_Ahmad_Tibrizi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = validasiInput(input, "Masukkan N angka: ");
        int angkaAwal = validasiInput(input, "Masukkan angka awal: ");

        int count = 0;

        if (n>0){
            do {
                if (angkaAwal % 2 != 0) {
                    System.out.print(angkaAwal);
                    count++;

                    if (count < n) {
                        System.out.print(", ");
                    }
                }
                angkaAwal++;
            }while (count<n);
        }


    }

    public static int validasiInput(Scanner input, String judul){
        while (true){
            try {
                System.out.print(judul);
                int angka = Integer.parseInt(input.nextLine().trim());
                return angka;

            } catch (NumberFormatException e){
                System.out.println("Input harus berupa angka!");
            }
        }
    }
}
