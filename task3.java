package week2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double pi=Math.PI;
        double circle=2*pi*r;
        double parameter= pi*r*r;
        System.out.println(circle);
        System.out.println(parameter);


    }
}
