import java.util.Scanner;

public class Inversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int invertido = 0;
        int digito;
        int q = number;


        while (q > 0)
        {
            digito = q % 10;
            invertido = invertido * 10 + digito;
            q = (int) Math.floor(q / 10);
        }

        System.out.println("Número original: " + number);
        System.out.println("Número invertido: " + invertido);
    }
}