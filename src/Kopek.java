public class Kopek extends Hayvan {
    private int disSayisi;

    public Kopek(String isim, int kilo, int boy, int bacakSayisi, int disSayisi) {
        super(isim, kilo, boy, bacakSayisi);
        this.disSayisi = disSayisi;
    }

    @Override
    public void hareketEt(int hiz) {
        System.out.println("Köpek " + hiz + " km/s hızla koşuyor!");
    }

    public void havla() {
        System.out.println("Köpek havlıyor: Hav Hav!");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Diş Sayısı: " + disSayisi);
    }
}
