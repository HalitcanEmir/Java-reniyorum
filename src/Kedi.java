public class Kedi extends Hayvan {
    private String renk;

    public Kedi(String isim, int kilo, int boy, int bacakSayisi, String renk) {
        super(isim, kilo, boy, bacakSayisi);
        this.renk = renk;
    }

    public void miyavla() {
        System.out.println("Kedi miyavlıyor: Miyav!");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Renk: " + renk);
    }
}
