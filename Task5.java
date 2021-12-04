package week2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int user = sc.nextInt();
        if (user >= 18)
            System.out.println("Eligible to vote");
    }
}
