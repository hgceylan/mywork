package H01_scanner;

import java.util.Scanner;

public class Q08H {
    public static void main(String[] args) {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);
        int vize1;
        int vize2;
        int finalNot;

        System.out.println(" vize1 notu :");
        vize1=scan.nextInt();

        System.out.println(" vize2 notu :");
        vize2=scan.nextInt();

        System.out.println(" final notu :");
        finalNot=scan.nextInt();

        double sonuc=((vize1+vize2)/2)*0.3 + finalNot*0.7;
        System.out.println(sonuc);


    }
}
