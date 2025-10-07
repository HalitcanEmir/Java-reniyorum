public class Hayvan {

    private String isim;
    private int kilo;
    private int boy;
    private int bacakSayisi;

    public Hayvan(String isim, int kilo, int boy, int bacakSayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacakSayisi = bacakSayisi;
    }

    public void yemekYe() {
        System.out.println(isim + " şu anda yemek yiyor...");
    }

    public void hareketEt(int hiz) {
        System.out.println(isim + " şu anda " + hiz + " km/s hızla hareket ediyor.");
    }

    public void bilgilerigoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Kilo: " + kilo);
        System.out.println("Boy: " + boy);
        System.out.println("Bacak Sayısı: " + bacakSayisi);
    }
}



}
