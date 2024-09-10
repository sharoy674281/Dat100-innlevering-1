package no.dat100.hvl;
import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hvor mange poeng fikk du på prøven?: ");
            int poengSum = scanner.nextInt();
            if (poengSum >= 0 && poengSum <= 100) {
                if (poengSum >= 90) {
                    System.out.println("Karakter A");
                }  else if (poengSum >= 80){
                    System.out.println("Karakter B");
                } else if (poengSum >= 60) {
                    System.out.println("Karakter C");
                } else if (poengSum >= 50) {
                    System.out.println("Karakter D");
                } else if (poengSum >= 40) {
                    System.out.println("Karakter E");
                } else if (poengSum >= 0) {
                    System.out.println("Karakter F :(");
                }
            } else {
                System.out.println("Skriv inn et poengsum mellom 0 og 100");
            }
        }
    }
}
