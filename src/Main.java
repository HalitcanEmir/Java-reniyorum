public class Main {
    public static void main(String[] args) {

        // Hayvan sınıfından bir nesne oluşturuyoruz
        Hayvan hayvan = new Hayvan("Aslan", 200, 120, 4);
        hayvan.yemekYe();
        hayvan.hareketEt(40);
        hayvan.bilgileriGoster();

        System.out.println("---------------");

        // Köpek sınıfından bir nesne oluşturuyoruz (alt sınıf)
        Kopek kopek = new Kopek("Karabaş", 25, 60, 4, 42);
        kopek.yemekYe();
        kopek.hareketEt(20); // Override edilmiş metod (farklı davranış)
        kopek.havla();
        kopek.bilgileriGoster();

        System.out.println("---------------");

        // Yeni bir örnek: kalıtım zincirinin genişlemesi
        Kedi kedi = new Kedi("Pamuk", 6, 30, 4, "Beyaz");
        kedi.yemekYe();
        kedi.hareketEt(15);
        kedi.miyavla();
        kedi.bilgileriGoster();
    }
}
