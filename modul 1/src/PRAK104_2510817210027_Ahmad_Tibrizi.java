import java.util.Scanner;

public class PRAK104_2510817210027_Ahmad_Tibrizi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String tanganAbu = getInputTangan(input, "Abu");
        String tanganBagas = getInputTangan(input, "Bagas");

        int poinAbu = 0;
        int poinBagas = 0;

        for (int i = 0; i< 3; i++){
            char abu = tanganAbu.charAt(i);
            char bagas = tanganBagas.charAt(i);

            if (abu == bagas){
                continue;
            } else if (
                    (abu == 'b' && bagas == 'g') || (abu == 'g' && bagas == 'k') || (abu == 'k' && bagas == 'b')
            ) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        if (poinAbu>poinBagas){
            System.out.println("Abu");
        } else if (poinBagas>poinAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }

    public static String getInputTangan(Scanner input, String pemain) {
        while (true) {
            System.out.print("Masukkan pilihan tangan " + pemain + "(B/G/K): ");
            String baris = input.nextLine().trim();
            String bersih = baris.replaceAll("\\s+", "").toLowerCase();
            if (bersih.matches("^[BbGgKk]{3}$")) {
                return bersih;
            }
            System.out.println("Input tidak valid! Harus memasukkan 3 pilihan urutan dari huruf B (Batu), G (Gunting), atau K (Kertas).\n");
        }
    }
}
