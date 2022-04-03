package H01_scanner;

import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfeb birinci tam sayiyi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println(" lutfen ikinci sayiyi girniz");
        double sayi2=scan.nextDouble();

        System.out.println(" iki sayinin toplami :" + (sayi1+sayi2));
        System.out.println(" iki sayinin farki :" + ( sayi1-sayi2));
        System.out.println(" iki sayinin carpimi :" + ( sayi1*sayi2));
        System.out.println(" iki sayini bolumu: " + (sayi1/sayi2));

    }
}
