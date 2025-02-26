import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

        // Alan Formülü : π * r * r;
        //Çevre Formülü : 2 * π * r;
        final float pi = 3.14f;
        float radius,area,circumference;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yarıçap değerini giriniz : ");
        radius = scan.nextFloat();

         area = pi * radius * radius;
        System.out.println("Dairenin alanı : " + area);

        circumference = pi * radius * 2.0f;
        System.out.println("Dairenin çevresi : " + circumference);

    }
}