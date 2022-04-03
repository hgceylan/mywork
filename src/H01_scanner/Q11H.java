package H01_scanner;

import java.util.Scanner;

public class Q11H {
    public static void main(String[] args) {
        /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona
         devam edeceği ay süresini  bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen isim ve soyisiminizi girniz:");
        String name = scan.nextLine();

        System.out.println(" lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        System.out.println(" lutfen kilonuzu giriniz :");
        double kilo = scan.nextDouble();

        System.out.println(" lutfen boyunuzu giriniz :");
        double boy = scan.nextDouble();

        System.out.println(" kac aylik uyelik istiyorsunuz: ");
        int uyelik = scan.nextInt();

        int aylikUcret = 20;
        int toplamTutar = uyelik * aylikUcret;
        System.out.println(" toplam tutar : "+ toplamTutar + "$");


    }
}
