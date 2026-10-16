package modul4.soal2;

import modul4.soal1.HewanPeliharaan;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;
    Anjing(String nama, String ras, String warnaBulu, String[] kemampuan){
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }
    void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : "+this.warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i< kemampuan.length; i++){
            System.out.print(kemampuan[i] + " ");
        }
        System.out.println();
    }
}
