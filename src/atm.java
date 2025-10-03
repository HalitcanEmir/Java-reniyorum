import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

Scanner scanner=new Scanner (System.in);
int bakiye = 1000;
String islemler = "1. İşlem : Bakiye Öğrenme\n"
                  +"2. İşlem : Para çekme\n"
                  +"3.İşlem : Para Yatrıma \n"
                  +"Çıkış için q a basın";

System.out.println(islemler);

while (true){
    System.out.println("İşlem seçiniz");
    String islem = scanner.nextLine();

    if (islem.equals("q")) {
        System.out.println("Programdan Çıkılıyor....");
        break;
    }
    else if (islem.equals("1")) {
         System.out.println("Bakiyeniz : " + bakiye);


        }
    else if (islem.equals("2")) {
         System.out.print("Çekmek istediğiniz tutar : ");
         int tutar = scanner.nextInt();
         scanner.nextLine();

         if (bakiye - tutar < 0) {
             System.out.println("Yeterli Bakiye yok, Bakiyeniz : " + bakiye);
         }
         else {
             bakiye -= tutar;
             System.out.println("Yeni bakiyeniz :" + bakiye);
         }

        }
    else if (islem.equals("3")) {
        System.out.println("Yatırmak istediğiniz tutar : ");
        int tutar = scanner.nextInt();
        scanner.nextLine();

        bakiye += tutar;
        System.out.println("Yeni bakiyeniz :" + bakiye);




        }
else {
    System.out.println("Geçersiz İşlem...");
        }

    }

}


    }



