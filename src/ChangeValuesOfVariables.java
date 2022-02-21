import java.util.Scanner;

public class ChangeValuesOfVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstVariable = scanner.next();
        String secondVariable = scanner.next();

        String auxVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = auxVariable;

        System.out.printf("First Variable %s\n", firstVariable);
        System.out.printf("Second Variable %s\n", secondVariable);
    }
}
