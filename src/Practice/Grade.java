package Practice;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int mark;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's marks: ");
        mark = sc.nextInt();

        grade = mark >= 95 ? "A" :
                mark >= 75 ? "B":
                        mark >= 65 ? "C" :
                                mark >= 55 ? "D" : "Fail";
        System.out.println("Student's grade: " + grade);
    }
}
