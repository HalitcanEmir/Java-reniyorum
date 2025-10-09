public class kus extends Hayvan {
    private String renk;

    public kus(String isim, int kilo, int boy, int bacakSayisi, String renk) {
        super(isim, kilo, boy, bacakSayisi);
        this.renk = renk;
    }

    public void otmek() {
        System.out.println("Kuş ötüyor: CİKCİK!");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Renk: " + renk);
    }
}
