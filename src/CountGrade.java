import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CountGrade {
    public static boolean requestGrade(@NotNull Scanner scanner) {
        double grade = scanner.nextDouble();

        if(grade < 0 || grade > 100){
            System.out.println("enter a valid value");
            return requestGrade(scanner);
        }

        return grade >= 50;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfApprovedStudents = 0;

        System.out.println("enter the number of students");
        int numberOfStudents = scanner.nextInt();

        for(int i = 0; i < numberOfStudents; i++){
            System.out.printf("enter the grade of student %s\n", i);
            boolean result = requestGrade(scanner);
            System.out.println(result);
            if(result)
                numberOfApprovedStudents++;
        }

        System.out.printf("number of approved students: %s\n", numberOfApprovedStudents);
    }
}
