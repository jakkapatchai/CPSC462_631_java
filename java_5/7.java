import java.util.Scanner;

class x {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter an score : ");

        int score = keyboard.nextInt();
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}