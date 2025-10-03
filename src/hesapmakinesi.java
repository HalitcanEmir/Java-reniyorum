import java.util.Scanner;


public class hesapmakinesi {
    public static void main(String[] args) {
       //siwtch case ile işlemleri belirtme
       Scanner scanner = new Scanner(System.in);

       String islemler = "1. Toplama İşlem\n"
                          +"2. Çıkartma işlemi\n"
                          +"3. Çarpma işlemi\n"
                          +"4. bölme işlemi\n";
       System.out.println(islemler);

       System.out.println("İşlem seçiniz");
       String islem = scanner.nextLine();
       int a;
       int b;


       switch(islem){
           case "1":
               System.out.print("Birinci Sayı: ");
               a = scanner.nextInt();
               System.out.print("İkinci sayı");
               b = scanner.nextInt();
               System.out.println("Toplam: " + (a+b));
           case "2":
               System.out.print("Birinci Sayı: ");
               a = scanner.nextInt();
               System.out.print("İkinci sayı");
               b = scanner.nextInt();
               System.out.println("Çıkartma: " + (a-b));
           case "3":
               System.out.print("Birinci Sayı: ");
               a = scanner.nextInt();
               System.out.print("İkinci sayı");
               b = scanner.nextInt();
               System.out.println("Çarpma : " + (a*b));
           case "4":
               System.out.print("Birinci Sayı: ");
               a = scanner.nextInt();
               System.out.print("İkinci sayı");
               b = scanner.nextInt();
               System.out.println("Toplam: " + ((double)a / b));

       }



    }





}
