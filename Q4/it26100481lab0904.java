import java.util.Scanner;

public class it26100481Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static String findGrades(double finalMark) {

        if (finalMark >= 75)
            return "A";
        else if (finalMark >= 60)
            return "B";
        else if (finalMark >= 50)
            return "C";
        else
            return "F";
    }

    public static void printDetails(String name, double finalMark, String grade) {

        System.out.println("\nStudent Name : " + name);
        System.out.println("Final Mark   : " + finalMark);
        System.out.println("Grade        : " + grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = Double.parseDouble(input.nextLine());

            System.out.print("Enter Exam Mark: ");
            double examMark = Double.parseDouble(input.nextLine());

            double finalMark = calcFinalMark(assignmentMark, examMark);
            String grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        input.close();
    }
}