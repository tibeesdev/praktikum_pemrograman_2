package modul3.soal3;

public class Mahasiswa {
    private String nama;
    private String nim;

    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}
