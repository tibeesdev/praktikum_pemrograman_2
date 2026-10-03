// Pada baris ini terjadi error karena package praktikum2.soal3 tidak ada, karena yang seharusnya diimport adalah package modul2.PRAK203_2510817210027_Ahmad_Tibrizi;
//package praktikum2.soal3;
package modul2.PRAK203_2510817210027_Ahmad_Tibrizi;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // pada baris ini terjadi error karena tidak ada titik koma ';'
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // belum ada assign nilai untuk umur
        p1.umur = 17;
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        // Tidak ada string tahun
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " Tahun");
    }
}