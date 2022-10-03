import java.util.Scanner;
public class kitleEndeksi {
    public static void main(String[] args) {
        double boy,kilo,kEnd;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();
        kEnd = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz :"+kEnd);
    }
}