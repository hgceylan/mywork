package H01_scanner;

import java.util.Scanner;

public class Q10H {
    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        // formula

        // c = (f-32)*5/9

        Scanner scan= new Scanner(System.in);
        System.out.print(" lutfen bir fahrenheit derecesi giriniz :");

        int f=scan.nextInt();
        System.out.println(" derece "+(f-32)*5/9);

    }
}
