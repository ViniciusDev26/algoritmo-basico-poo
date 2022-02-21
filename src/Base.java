import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToBin = scanner.nextInt();
        String result = Integer.toBinaryString(numberToBin);

        System.out.println(result);
    }
}
