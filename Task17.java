package week2;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 10) {
            sum += n % 10;
            n = n / 10;
        }
        sum += n;
        System.out.println(sum);
    }

}
