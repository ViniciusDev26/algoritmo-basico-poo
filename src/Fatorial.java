import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int fatorial = 1;
        double i = scanner.nextDouble();

        while( i >= 1 ){
            fatorial *= i;
            i--;
        }

        System.out.println(fatorial);
    }
}