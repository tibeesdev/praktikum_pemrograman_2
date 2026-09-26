import java.util.Scanner;

public class PRAK105_2510817210027_Ahmad_Tibrizi {
    public static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = getValidDouble(input, "jari-jari");
        double t = getValidDouble(input, "tinggi");
        double volume = PHI * r * r * t;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);
    }

    public static double getValidDouble(Scanner input, String label) {
        while (true) {
            System.out.print("Masukkan " + label + ": ");
            String teks = input.nextLine().trim();
            if (teks.isEmpty()) {
                System.out.println(label + " tidak boleh kosong!\n");
                continue;
            }
            teks = teks.replace(',', '.');

            try {
                double nilai = Double.parseDouble(teks);
                if (nilai <= 0) {
                    System.out.println(label + " harus bernilai lebih dari 0!\n");
                    continue;
                }
                return nilai;
            } catch (NumberFormatException e) {
                System.out.println(label + " harus berupa angka yang valid!\n");
            }
        }
    }
}