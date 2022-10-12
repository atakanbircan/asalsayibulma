import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int girilenSayi;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        girilenSayi=input.nextInt();*/
        int sayac=0;
        System.out.print("asal sayılar: ");
        for (int i=2;i<=100;i++) {
            int kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                    break;
                }
            }
            if (kontrol == 0) {
                System.out.println(i+"\n");
                sayac++;
            }
        }
    }
}