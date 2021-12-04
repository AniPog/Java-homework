package week2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = (int) (2 + rnd.nextDouble() * 5);
        System.out.println(randomNumber);
    }
}
