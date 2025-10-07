public class Kopek {public class Kopek extends Hayvan {

    private int disSayisi;

    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
        super(isim, kilo, boy, bacakSayisi); // Üst sınıfın constructor'ını çağırıyoruz
        this.disSayisi = disSayisi;
    }

    public void havla() {
        System.out.println("Köpek havlıyor: Hav hav!");
    }

    @Override
    public void hareketEt(int hiz) {
        System.out.println("Köpek " + hiz + " km/s hızla koşuyor.");
    }

    public void bilgileriGoster() {
        super.bilgilerigoster();
        System.out.println("Diş Sayısı: " + disSayisi);
    }
}

}
