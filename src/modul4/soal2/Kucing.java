package modul4.soal2;

import modul4.soal1.HewanPeliharaan;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    Kucing(String nama, String ras, String warnaBulu){
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }
    void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu : "+this.warnaBulu);
    }
}
