package week2;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        int d= sc.nextInt();
        int i=1;
        while (x%Math.pow(d,i)==0) {
            i++;
        }
        i--;
        System.out.println(i);



    }
}

