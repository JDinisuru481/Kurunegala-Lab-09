import java.util.Scanner;

public class IT26100481Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 0.30) + (exam * 0.70);
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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double exam = input.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.println("\nName\t\tFinal Mark\tGrade");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s\t%-10.2f\t%s\n",
                    names[i],
                    finalMarks[i],
                    grades[i]);
        }

        input.close();
    }
}