package modul2.PRAK201_2510817210027_Ahmad_Tibrizi;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah_beli;
    private double total;
    private double diskon;

    Buah (String nama, double berat, double harga, double jumlah_beli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
        this.total = harga * (jumlah_beli/berat);
    }

    public double getDiskon (){
        double total = 0;
        double diskon = 0;
        for (int i = 0; i < jumlah_beli/4; i++) {
            total += harga * (4/berat);
            diskon+= total * 0.02;
        }
        return diskon;
    }

    public void info(){
        this.diskon = getDiskon();
        System.out.printf("" +
                "Nama Buah: %s\n" +
                        "Berat: %.1f\n" +
                        "Harga: %.1f\n" +
                        "Jumlah Beli: %.1f kg\n" +
                        "Harga Sebelum Diskon: Rp%.2f\n" +
                        "Total Diskon: Rp%.2f\n" +
                        "Harga Setelah Diskon: Rp%.2f\n\n",
                this.nama, this.berat, this.harga,
                this. jumlah_beli, this.total, this.diskon,
                (this.total - this.diskon)
                );

    }

}

