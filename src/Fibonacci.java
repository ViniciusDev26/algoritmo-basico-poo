import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o numero de termos da sequencia");
        int numeroDeTermosDaSequencia = scanner.nextInt();

        int numberOne = 0;
        int numberTwo = 1;
        int number;

        System.out.print(numberOne + ", " + numberTwo);
        for(int i = 3; i <= numeroDeTermosDaSequencia; i++){
            number = numberOne + numberTwo;
            System.out.print(", " + number);

            numberOne = numberTwo;
            numberTwo = number;
        }
    }
}