package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    private static int sumaCifara(int x) {
        int suma = 0;
        while (x != 0) {
            suma = suma + x % 10;
            x = x / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
	    Scanner ulaz = new Scanner(System.in);
        System.out.print("Unesite prirodan broj n: ");
        int n = ulaz.nextInt();
        if (n < 1) System.out.println("Niste unijeli prirodan broj");
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) System.out.print(i + " ");
        }
    }
}
