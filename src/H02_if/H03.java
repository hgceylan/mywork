package H02_if;

import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        /* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		 */
        Scanner scan= new Scanner(System.in);

        System.out.println(" lutfen boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println(" lutfen kilonuzu giriniz");
        double kilo=scan.nextDouble()/100;

        double BMI= kilo/(boy*boy);
        if(BMI<=20){
            System.out.println("oldukca zayifsiniz");
        }else if(20<BMI && BMI<=25){
            System.out.println("Normal sinirlardasiniz");
        }else if(25<BMI && BMI<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else if(30<BMI){
            System.out.println("Obez grubundasiniz.");
        }else
            System.out.println("yanlis veri girdiginiz");



    }
}
