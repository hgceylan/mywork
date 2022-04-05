package H02_if;

import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen yapacaginiz islemi seciniz : \ntoplama icin :1\ncikarma icin :2\ncarpma icin :3" +
                "\nbolme icin: 4");
        int secim=scan.nextInt();
        System.out.println(" lutfen iki tam sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if(secim==1){
            System.out.println(" iki sayinin toplami : "+ sayi1+sayi2);
        }else if(secim==2){
            System.out.println(" iki sayinin farki :"+ (sayi1-sayi2));
        }else if(secim==3){
            System.out.println(" iki sayinin carpimi : "+ (sayi1*sayi2));
        }else if(secim==4){
            System.out.println(" iki sayini bolumu : "+ ( sayi1/sayi2));
        }else System.out.println(" hatali islem sectiniz ");

    }
}
