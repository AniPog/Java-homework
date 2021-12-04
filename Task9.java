package week2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (x1 * x2 > 0 && y1 * y2 > 0) {
            System.out.println("In the same quarter");
        } else {
            System.out.println("Not in the same quarter");
        }

    }
}
