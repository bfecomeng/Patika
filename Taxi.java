import java.util.Scanner;
public class Taxi {
    public static void main(String[] args) {

        float km = 2.20f,acilis = 10.0f,istenenYol,odenecekPara=0.0f;

        Scanner scan = new Scanner(System.in);

        System.out.print("Gidilecek yolu (KM) cinsinden yazınız : ");
        istenenYol = scan.nextFloat();

        odenecekPara = acilis + (istenenYol * km);
            if (odenecekPara > 20)
                {
                    System.out.println("Açılış ücreti : " + acilis);
                    System.out.println("Gidilmek istenen yol (KM) : " + istenenYol );
                    System.out.println("Ödeyeceğiniz toplam tutar : " + odenecekPara);
                }
            else{
                    odenecekPara = 20.0f;
                    System.out.println("Açılış ücreti : " + acilis);
                    System.out.println("Gidilmek istenen yol (KM) : " + istenenYol );
                    System.out.println("Ödeyeceğiniz toplam tutar : " + odenecekPara);
                }
    }
}