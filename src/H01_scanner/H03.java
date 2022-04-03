package H01_scanner;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {

        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini
         * bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */

        Scanner scan= new Scanner(System.in);
        System.out.println(" lutfen 5 basamakli bir sayi giriniz");
        int sayi =scan.nextInt();
        int ilkIki= sayi%100;
        int sonIki= sayi/ 1000;
        System.out.println(" ilk iki basamak:" + ilkIki);
        System.out.println(" son iki basamak :" +sonIki);
        System.out.println(" bulunan iki sayini toplami :"+ (ilkIki+sonIki));

    }
}
