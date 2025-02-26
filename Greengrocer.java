import java.util.Scanner;
public class Greengrocer {
    public static void main(String[] args) {
       double armut,elma,domates,patlican,muz,toplam;
       double arkg = 2.14f,elkg=3.67f,domkg=1.11f,patkg=5.00f,muzkg=0.95f;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaç kilo armut alacaksınız : ");
        armut = scan.nextDouble();
        System.out.print("Kaç kilo elma alacaksınız : ");
        elma = scan.nextDouble();
        System.out.print("Kaç kilo domates alacaksınız : ");
        domates = scan.nextDouble();
        System.out.print("Kaç kilo patlican alacaksınız : ");
        patlican = scan.nextDouble();
        System.out.print("Kaç kilo muz alacaksınız : ");
        muz = scan.nextDouble();

        toplam = (armut*arkg + elma*elkg + domates*domkg + patlican*patkg + muz*muzkg);

        System.out.println("Toplam manav tutarınız : " + toplam);

    }
}