import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = scan.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0f;

       String kosul =(sonuc > 60) ? "Geçti" : "Kaldı";
        System.out.println("Ortalamanız : " + sonuc + "\nDurum : " + kosul);
    }
}