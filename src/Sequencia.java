import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma serie de caracteres:");
        String string = scanner.nextLine();
        int decimal = 0;
        char base = (int) '0';

        for(int i = 0; i < string.length(); i++){
            int caracter = string.charAt(i) - base;
            decimal = decimal * 10 + caracter;
        }

        System.out.println(decimal);
    }
}
