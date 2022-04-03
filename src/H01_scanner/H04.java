package H01_scanner;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
 /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen 1. kenari giriniz");
        int a = scan.nextInt();
        System.out.println(" lutfen 2. kenari giriniz");
        int b = scan.nextInt();


        double hipotenus=Math.sqrt((a*a)+ (b*b));
        System.out.println(" hipotenus :"+ hipotenus);
    }
}
