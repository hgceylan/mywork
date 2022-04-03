package H01_scanner;

import java.util.Scanner;

public class Q09H {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print(" a :");
        a = scan.nextDouble();

        System.out.print(" b :");
        b = scan.nextDouble();

        System.out.print(" c :");
        c = scan.nextDouble();

         double toplam=((a*a)-(b*b)) / (3*c);
        System.out.println(toplam);

    }
}
