
import java.util.Scanner;
public class kdv {
    public static void main(String[] args) {

        float maas,kdvOrani = 0.18f,kdvDusukOrani = 0.08f,kdvTutari,kdvliMaas;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Maaşınızı giriniz : ");
        maas = scan.nextFloat();

        if (maas > 0 && maas <1000){
            kdvTutari = maas * kdvOrani;
            kdvliMaas = maas + kdvTutari;
            System.out.println("KDV oranınız : " + kdvOrani + "'dır. Ve maaşınız : " + kdvliMaas);
        }
        else{
            kdvTutari = maas * kdvDusukOrani;
            kdvliMaas = kdvTutari + maas;
            System.out.println("KDV oranınız : " + kdvDusukOrani + "'dır. Ve maaşınız : " + kdvliMaas);
        }
    }
}