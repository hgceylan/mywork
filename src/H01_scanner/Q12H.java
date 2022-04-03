package H01_scanner;

import java.util.Scanner;

public class Q12H {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */
        Scanner scan=new Scanner(System.in);

        System.out.println(" bir isci isi kac gunde bitirmektedir" );
        int isinBitmeSuresi= scan.nextInt();

        System.out.println("toplam kac kisi calisacak :");
        int isciSayisi=scan.nextInt();

        int cokluIsBitimSuresi=isinBitmeSuresi/isciSayisi;
        System.out.println("isin bitme suresi : " + cokluIsBitimSuresi);



    }
}
