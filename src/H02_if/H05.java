package H02_if;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen urun adedi giirniz");
        int urunAdet=scan.nextInt();

        System.out.println(" aldiginiz urunun liste fiyatini giriniz");
        double fiyat=scan.nextDouble();
        double total;

        System.out.println(" musteri kartiniz var mi? : var ise Y\n yok ise N\n yaziniz" );
        char kart=scan.next().toLowerCase().charAt(0);

        if(kart=='y'){
            if(urunAdet>10){
                fiyat=fiyat*0.80;
                total=fiyat*urunAdet;
                System.out.println(" %20 indirim hakki kazandiniz odemeniz gereken tutar"+ total);

            }else if( urunAdet<10){
                fiyat=fiyat*0.75;
                total=fiyat*urunAdet;
                System.out.println("%15 indirim hakki kazandiniz odemeniz gereken tutar: "+ total);
            }

        }else if(kart=='n'){
            if(urunAdet>10){
                fiyat=fiyat*0.75;
                total=fiyat*urunAdet;
                System.out.println("%15 indirim hakki kazandiniz odemeniz gereken tutar : "+ total);

            }else if(urunAdet<10){
                fiyat=fiyat*0.90;
                total=fiyat*urunAdet;
                System.out.println("% 10 indirim hakki kazandiniz odemeniz gereken tutar : "+ total);
            }
        }else System.out.println(" hatali giris yaptiniz");


    }
}
