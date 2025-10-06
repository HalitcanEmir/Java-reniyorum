public class Hayvan {

    private String isimm;

    private int kilo;

    private int boy;

    private int bacak_sayisi;

    public Hayvan(String isimm, int kilo, int boy, int bacak_sayisi) {
        this.isimm = isimm;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    }
    public void yemek_ye() {
        System.out.println("Hayvan şu anda yemek yiyor");
    }
    public void harakete_gec(int hız) {

        System.out.println("Hyavan" + hız + "İle haraket ediyor");


        System.out.println("Hayvanların Özellikleri");
    }


}
