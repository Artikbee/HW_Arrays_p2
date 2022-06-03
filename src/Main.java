import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskOne();// 1 задание
        taskTwo();// 2 задание
        taskThree();// 3 задание
        taskFour (); // 4 задание
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void taskOne() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += + arr [i];
        }
        System.out.println("Sum one month= " + sum + " rub");
    }

    public static void taskTwo() {
        int minSpend = arr[0];
        int maxSpend = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpend) {
                maxSpend = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpend) {
                minSpend = arr[i];
            }
        }
        System.out.println("Maximum Value is " + maxSpend);
        System.out.println("Minimum Value is " + minSpend);
    }

    public static void taskThree() {
        int averSum = 0;
        for (int i = 0; i < arr.length; i++) {
            averSum += arr[i];
        }
        System.out.println("Mean = "+(double)averSum/arr.length);
    }
    public static void taskFour(){
        char [] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}