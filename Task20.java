package week2;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.println(i);
            }

        }

    }
}
