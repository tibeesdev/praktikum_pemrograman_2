// Pada baris ini terjadi error karena package praktikum2.soal3 tidak ada, karena yang seharusnya diimport adalah package modul2.PRAK203_2510817210027_Ahmad_Tibrizi;
//package praktikum2.soal3;
package modul2.PRAK203_2510817210027_Ahmad_Tibrizi;

// pada baris ini terjadi error karena nama class harusnya sama dengan nama file,
//public class Employee {
public class Pegawai{
    public String nama;
    // pada baris ini bukan terjadi error tapi lebih tepatnya kesalahan logika karena asal daerah pegawai harusnya berisikan string alamat bukan char yang hanya bisa menyimpan satu karakter
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }

    // pada baris ini terjadi error karena setter jabatan harusnya punya parameter buat diisi di state jabatan
    //public void setJabatan() {
    public void setJabatan(String j){
        this.jabatan = j;
    }
}