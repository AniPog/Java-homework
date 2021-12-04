package week2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a * b % 7 == 0 && a > b && b > 0) {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
