package no.dat100.hvl;
import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvor mye er buttolønnen din på?: ");
        int bruttoLoenn = scanner.nextInt();
        double sum;

        if (bruttoLoenn >=  1350001) {
            sum = bruttoLoenn * 0.176;
            System.out.println("Du har en trinnskatt på " + sum);
        } else if (bruttoLoenn >= 937901) {
            sum = bruttoLoenn * 0.166;
            System.out.println("Du har en trinnskatt på " + sum);
        }   else if (bruttoLoenn >= 670001) {
            sum = bruttoLoenn * 0.136;
            System.out.println("Du har en trinnskatt på " + sum);
        }  else if (bruttoLoenn >= 292851) {
            sum = bruttoLoenn * 0.04;
            System.out.println("Du har en trinnskatt på " + sum);
        }  else if (bruttoLoenn >= 208051) {
            sum = bruttoLoenn * 0.017;
            System.out.println("Du har en trinnskatt på " + sum);
        } else {
            System.out.println("Ingen trinnskatt!");
        }
    }
}
