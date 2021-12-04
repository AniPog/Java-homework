package week2;

public class Task4 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x + y);
        System.out.println("String" + x + y);
        System.out.println("String" + (x + y));
        int num = 584;
        System.out.println((num + "").length());
        int size = 0;

        while (num > 0) {
            size++;
            num = num / 10;
        }
        System.out.println(size);
        int[] twoNumberArray = {2, 4};

        System.out.println(twoNumberArray);

        int[] thousandNumberArray = new int[1000];
        for (int i = 0; i < thousandNumberArray.length; i++) {
            thousandNumberArray[i] = i;
        }

        int[] range = new int[20];
        int start = -20;
        int index = 0;
        for (int i = 0; i < 40; i++) {
            if (start % 2 != 0) {
                range[index] = start;
                index++;
            }
            start++;
        }

        System.out.println(range);

        for (int i = 0; i < range.length; i++) {
            System.out.println(range[i]);
        }

    }


}
