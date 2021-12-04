package week2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quiz = sc.nextInt();
        int midTerm = sc.nextInt();
        int finalScore = sc.nextInt();
        int average = (quiz + midTerm + finalScore) / 3;
        if (average >= 80) {
            System.out.println("grade=A");
        } else if (average >= 60) {
            System.out.println("grade=B");
        } else if (average >= 40) {
            System.out.println("grade=C");
        }

        else {
            System.out.println("grade=F");
        }


    }
}
