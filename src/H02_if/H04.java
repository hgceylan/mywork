package H02_if;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */

        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        if(harf>'a' && harf<'z'){
            System.out.println(" kucuk harf");

        }else if(harf>'A' && harf<'Z'){
            System.out.println(" buyuk harftir");
        }else
            System.out.println(" hatali giriniz yaptiniz");

    }
}
