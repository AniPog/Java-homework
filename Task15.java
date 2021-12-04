package week2;


import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 1;
        int a = 0;
        while (g < n) {
            g *= 2;
            a++;
        }
        System.out.println(a);
    }
}

