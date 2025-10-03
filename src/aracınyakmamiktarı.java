import java.util.Scanner;

public class aracınyakmamiktarı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız kilometre kaç kuruş yakıyor(Örnek : 0.4");
        double kurus = scanner.nextDouble();
        int km = scanner.nextInt();
        System.out.println("Toplam ödeminiz gereken tutar :" + (kurus + km)+ "tldir");



    }



}