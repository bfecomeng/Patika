import java.util.Scanner;
public class ucgen {
    public static void main(String[] args) {
    float  a,b,c,u,cevre,alan;
    Scanner scan = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz : ");
        a = scan.nextFloat();
        System.out.println("2. Kenarı giriniz : ");
        b = scan.nextFloat();
        System.out.println("3. Kenarı giriniz : ");
        c = scan.nextFloat();

        u = (a+b+c)/2.0f;
        cevre = 2.0f*u;
        System.out.println("Üçgenin çevresi : " + cevre);
       // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        alan =(float) Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("Üçgenin alanı : " + alan);
    }
}