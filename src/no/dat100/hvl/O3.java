package no.dat100.hvl;

import java.util.Scanner;

public class O3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("finn fakultet av n: ");
        int n = scanner.nextInt();
        if (n > 0) {
            for (int i = n-1; i >= 1; i--) {
                n *= i;
            }
            System.out.println(n);
        } else {
            System.out.println("Oppgi et heltall fra 1 og oppover!");
        }
    }
}
