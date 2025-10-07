public class Main {
    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan("Aslan", 200, 120, 4);
        hayvan.yemekYe();
        hayvan.hareketEt(40);
        hayvan.bilgilerigoster();

        System.out.println("---------------");

        Kopek kopek = new Kopek("Karabaş", 25, 60, 4, 42);
        kopek.yemekYe();
        kopek.hareketEt(20); // Override edilmiş metod
        kopek.havla();
        kopek.bilgileriGoster();
    }
}