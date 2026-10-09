package modul3.soal2;

import java.util.HashMap;

public class Negara {
    private String nama;
    private String jenis_kepemimpinan;
    private String nama_pemimpin;
    private Integer tanggal_kemerdekaan;
    private String bulan_kemerdekaan;
    private Integer tahun_kemerdekaan;
    HashMap<Integer, String> hashmapBulan = new HashMap<Integer, String>();
    Negara (String nama, String jenis_kepemimpinan, String nama_pemimpin, Integer tanggal_kemerdekaan, String bulan_kemerdekaan, Integer tahun_kemerdekaan){
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
        this.bulan_kemerdekaan = bulan_kemerdekaan;
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }
    Negara (String nama, String jenis_kepemimpinan, String nama_pemimpin){
        this.nama = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
    }
    public void getInfo(){
        if (!this.jenis_kepemimpinan.equalsIgnoreCase("monarki")){
            System.out.print("Negara "+ this.nama+" mempunyai Presiden bernama " + this.nama_pemimpin +
                    " Deklarasi Kemerdekaan pada Tanggal " + this.tanggal_kemerdekaan + " " + bulan_kemerdekaan+ " " + this.tahun_kemerdekaan);
        }else{
            System.out.print("Negara "+ nama + " mempunyai Raja bernama " + nama_pemimpin);
        }
        }
}
