public class Calisan {
    private String isim;

    private  int maas;

    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void calis() {

        System.out.println("Çalışan Çalışıyor");
    }
     public void bilgilerigoster(){

        System.out.println("İsim :"+ isim);
        System.out.println("Maaş :" + maas);
        System.out.println("Departman :"+ departman);
    }
     public void departman_degistir(String yeni_departman) {
        System.out.println("Departman değiştiriliyor");
        this.departman = yeni_departman;

        System.out.println("Çalışan Çalışıyor");




     }

}
