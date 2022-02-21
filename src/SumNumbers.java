import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRepeats = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < numberOfRepeats; i++){
            System.out.printf("Total: %s\n", total);
            System.out.println("enter a number to sum");

            total += scanner.nextDouble();
        }

        System.out.printf("Total: %s", total);
    }
}
