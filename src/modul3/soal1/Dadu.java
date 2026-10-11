package modul3.soal1;
import java.util.Random;

public class Dadu {
    private int angka;

    public int acakNilai(){
        Random random = new Random();
        int nilaiDadu = random.nextInt(5)+1;
        return nilaiDadu;
    }
}