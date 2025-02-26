import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
       double boy,kilo,result;

       Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre(m) cinsinden giriniz : ");
        boy = scan.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextFloat();

        result = kilo / (boy * boy) ;

        System.out.println("Vücut Kitle İndeksiniz : " + result);
    }
}