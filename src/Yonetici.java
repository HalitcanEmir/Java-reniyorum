public class Yonetici extends Calisan {

    private int sorumlu_kisi;

    public Yonetici(String isim, int maas,String departman, int sorumlu_kisi) {
        //this.isim = isim;
        //this.maas = maas;
        //this.departman = departman;
        super(isim,maas,departman);

        this.sorumlu_kisi = sorumlu_kisi;
    }
    public void zam_yap(int zam_miktarı) {
        System.out.println("Çalışanlara" + zam_miktarı + "zam yapıldı");

    }



}

