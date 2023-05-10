import java.util.Scanner;

public class ucgen_cevresi {
    public static void main(String[] args) {

        int a,b,c;
        double u,alan;

        Scanner veri = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz =");
        a= veri.nextInt();

        System.out.print("İkinci Kenarı Giriniz =");
        b= veri.nextInt();

        System.out.print("İkinci Kenarı Giriniz =");
        c= veri.nextInt();

        u= (a+b+c)/2;

        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı ="+alan);







    }
}
