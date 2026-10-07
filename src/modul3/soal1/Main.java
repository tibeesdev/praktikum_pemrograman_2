package modul3.soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LinkedList <Integer> linkedList = new LinkedList<Integer>();
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu : ");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++){
            Dadu dadu = new Dadu();
            int nilai_dadu = dadu.acakNilai();
            System.out.print("Dadu ke-" + i + " bernilai " + nilai_dadu +"\n");
            total += nilai_dadu;
            linkedList.add(nilai_dadu);
        }
        System.out.print("Total nilai dadu keseluruhan "+total);


    }
}
