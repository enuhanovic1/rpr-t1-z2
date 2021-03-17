package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int sumaCifara (int x) {
        int suma = 0;
        while (x != 0) {
            suma = suma + (x % 10);
            x = x / 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.print("Unesite pozitivan cijeli broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        if (n < 1) {
            System.out.println("Niste unijeli pozitivan cijeli broj!");
            System.exit(0);
        }
        System.out.print("Brojevi između 1 i ");
        System.out.print(n);
        System.out.print(" djeljivi sa sumom svojih cifara su: ");
        for (int i=1; i<=n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.print(i);
                if (i != n) System.out.print(", ");
            }
        }
    }
}
