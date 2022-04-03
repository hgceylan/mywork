package H01_scanner;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen uc basamakli bir sayi giriniz");

        int sayi=scan.nextInt();
        int birler=sayi%10;
        System.out.println(" sayini birler basamagi :" + birler);
        sayi/=10;


        int onlar= sayi%10;
        System.out.println(" sayini onlar basamagi :"+ onlar );
        sayi/=10;

        int yuzler=sayi%10;
        System.out.println(" sayinin yuzler basamagi :"+ yuzler);
        sayi/=10;

    }
}
