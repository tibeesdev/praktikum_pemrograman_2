package modul3.soal1;
import java.util.Random;
import java.util.LinkedList;

public class Dadu {
    private int angka;
//
//    Dadu(int angka){
//        this.angka = angka;
//    }

    public int acakNilai(){
        Random random = new Random();
        int nilaiDadu = random.nextInt(5)+1;
        return nilaiDadu;
    }
}



