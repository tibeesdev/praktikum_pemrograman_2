package modul2.PRAK202_2510817210027_Ahmad_Tibrizi;

public class Kopi {
    public  String namaKopi;
    public String ukuran;
    public double harga;
    private String pembeli;


    public void info(){
        System.out.printf(
                "Nama Kopi: %s\n"+
                        "Ukuran: %s\n" +
                        "Harga: %.1f\n",
                this.namaKopi, this.ukuran, this.harga);
    }

    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getPajak(){
        double diskon = (harga * 11) / 100;
        return diskon;
    }
}
