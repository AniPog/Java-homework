package week2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if (a < 10 && b != 10) {
            System.out.println("a is illegal b is legal");
        } else if (a > 10) {
            System.out.println("a is legal b is illegal");
        } else {
            System.out.println("both illegal");
        }

        if (a*b%5==0) {
            System.out.println("Both a and b legal");
        } else {
            System.out.println("both illegal");
        }

    }
}
