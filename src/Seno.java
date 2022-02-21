import java.util.Scanner;

public class Seno {
    public static long fatorial(long n) {
        long fat = 1;
        for(long i = n; i >= 1; i--) {
            fat = fat * i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor de x");
        int x = scanner.nextInt();

        System.out.println("digite o numero de termos da serie");
        int n = scanner.nextInt();

        double termo;
        int sinal = 1;
        int j = 1;
        double seno = 0;

        for(int i = 0; i < n; i++){
            termo = Math.pow(x, j) / fatorial(j);
            seno = seno + sinal * termo;
            sinal = -1 * sinal;
            j += 2;
        }

        System.out.printf("Seno: %.2f\n", seno);
    }
}