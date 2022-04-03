package H01_scanner;

import java.util.Scanner;

public class Q06H {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println(" gidecegin yol mesafe km.:");
        double yol=scan.nextDouble();
        System.out.println(" ortalama hiziniz ne kadar (k/s):");
        double hiz=scan.nextDouble();
        double varisSuresi= yol/hiz;
        System.out.println(" varis suredniz:"+ varisSuresi);

    }
}
