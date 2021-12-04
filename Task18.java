package week2;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
