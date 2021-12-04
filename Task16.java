package week2;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int a = 1; a < n; a++) {
            if (a % 3 != 0) {
                System.out.println(a);
            }
        }
    }
}
