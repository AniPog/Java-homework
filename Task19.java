package week2;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }

}
