package project;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


    public class FilmTahminiH {

        // static yaptik cunku class icinde her yerden cagirabilmek icin
        //List ' e attik cunku sirasi ile cagirmayacagimiz icin

        static List<String> filmler = new ArrayList<String>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE",
                "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
        /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
        // Static yaptik class icinde her yerden ulsabilmek icin

        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            //Scanner scan=new Scanner(System.in)

            System.out.println(" ~~~ FILM TAHMIN OYUNUNA HOSGELDINIZ ~~~");

            System.out.println("1- " + filmler.size() + " arasinda bir sayi giriniz");
            // 1 ile filmlerin harf uzunlugu arasinda bir sayi girmesini istiyoruz

            int secilenFilmIndex = scan.nextInt();

            filmGetir(filmler, secilenFilmIndex - 1);
            //film getir methodu olusturdum, filmler objesinden secilen filmin uzunlugunun bir eksigini getirsin

        }

        private static void filmGetir(List<String> film, int index) {
            //Scanner scan=new Scanner(System.in);
            // classin icinde en ustte static olarak koydugumuz icin buna gerek yok


            StringBuilder tahminEdilecekFilm = new StringBuilder(FilmTahminiH.filmler.get(index).replaceAll("\\w", "-"));
            // StrinBuilder kullandik cunku icine birden fazla parametre yazmak icin
            // FilmTahmin class'indan, filmler objesinin index 'ini getir
            // tum harfleri - yap cunku kullanici filmleri gormesin diye

            System.out.println(tahminEdilecekFilm);
            // filmi kullanici gormesin diye tum harfler - seklinde oldu

            System.out.println(film.get(index).length() + " harfli yabaci film sectiniz.Film tahmin etmek icin" +
                    2 * film.get(index).length() + " hakkiniz var");
            // film index 'inin uzunlugunu yazdi ve index uzunlugu kadar tahmin hakkinin oldugunu soyledi

            char harf = ' ';  // harf yazacagi icin char methodunu kullandik
            int tahminSayisi = 0;    // her harf girdiginde bos bir int atadik yanlis sayisini toplamak icin
            int dogruTahminSayısı = 0;
            String str = "";

            // bir durum oldugu icin do while kullandik

            do {
                System.out.println("yanlis girilen tahmin sayisi:" + (tahminSayisi - dogruTahminSayısı) + "/" + 2 * film.get(index).length() +
                        "\ntahmin ettiginiz harfi giriniz : ");
                //  yanlis girilen tahmin sayisini yazdirdik
                //  ne kadar tahmin hakki oldugunu bulduk ve tekrardan bir harf girmesini istedik

                harf = scan.next().toUpperCase().charAt(0);
                // film icin tahmin edilen harfi aldik

                str += harf;
                // kullanicinin girdigi harfi str ye atadik yani filmin harflerinin icine atadik

                // Tahmin edilecek filmin tum harflerinde kullanicinin soyledigi harf icermiyorsa yanlis tahmin sayisi artirildi
                if (!tahminEdilecekFilm.toString().contains(str)) {
                    tahminSayisi++;
                } // else {// tahmin edilecek filmde kullanicidan alinan harf varsa tekrar uyarisi verildi
                //System.out.println(str +" harf zaten acildi");

                for (int i = 0; i < tahminEdilecekFilm.length(); i++) {
                    if (film.get(index).charAt(i) == harf) { // tahmin  edilen harf filmin icindeki harflerde varsa
                        if (!tahminEdilecekFilm.toString().contains(film.get(index).substring(i, i + 1))) {
                            // tahmin edilen harf listede var ama ---- yoksa dogru tahmin etmis demektir
                            dogruTahminSayısı++;

                        }
                        tahminEdilecekFilm.setCharAt(i, harf); // dogru tahmin ise bu harfi tahmin edilecek filmin index ine yaz
                    }
                }
                if (tahminEdilecekFilm.toString().equalsIgnoreCase(film.get(index))) {
                    //tahmin edilecek filmin tum harflerini film harflerine yazdiktan sonra
                    System.out.println(" tebrikler kazandiniz");
                    System.out.println(" tahmin ettiginiz film : " + tahminEdilecekFilm);
                    break;

                }
                System.out.println(tahminEdilecekFilm);


            } while ((tahminSayisi - dogruTahminSayısı) != 2 * film.get(index).length());
            // tahmin sayisi dogru tahmin edilene kadar calisir yani yanlis sayisi verilen hakka kadar calisti
            if ((tahminSayisi - dogruTahminSayısı) == 2 * film.get(index).length()) {
                System.out.println("yanlis tahmin sayisi :" + (tahminSayisi - dogruTahminSayısı));
                System.out.println("agam game over  yine bekleriz ... tahmin edemedigin film :" + film.get(index));
            }


        }
    }