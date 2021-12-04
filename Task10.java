package week2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Can not be");
        } else if (d == 0) {
            System.out.println("solution will be " + -b / (2 * a));

        } else {
            System.out.println("one solution will be " + (-b + Math.sqrt(d)) / (2 * a));
            System.out.println("second solution will be " + (-b - Math.sqrt(d)) / (2 * a));
        }

    }
}
