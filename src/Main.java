import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int [] number = new int [] {1, 2, 3};
        number [0] = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println(number[i]);
        }
        System.out.println();
        double [ ] newNumber = {1.57, 7.654, 9.986};
        newNumber [0] = 1.57;
        for (int i = 0; i < newNumber.length; i++) {
            System.out.println(newNumber[i]);
        }
        System.out.println();
        int [] weight = {56, 58, 60, 62, 65, 63, 61, 59};
        weight [0] = 56;
        for (int i = 0; i < weight.length ; i++) {
            System.out.println(weight[i]);
        }
    }
    public static void task2() {
        System.out.println("Задание 2");
        int[] number = new int[]{1, 2, 3};
        number[0] = 1;
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        System.out.println();

        double[] newNumber = {1.57, 7.654, 9.986};
        newNumber[0] = 1.57;
        for (int i = 0; i < newNumber.length; i++) {
            if (i == newNumber.length - 1) {
                System.out.print(newNumber[i]);
                break;
            }
            System.out.print(newNumber[i] + ", ");
        }
        System.out.println();

        int[] weight = {56, 58, 60, 62, 65, 63, 61, 59};
        weight[0] = 56;
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задание 3");
        int[] number = new int[]{1, 2, 3};
        number[2] = 3;
        for (int i = 2; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.print(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        System.out.println();

        double[] newNumber = {1.57, 7.654, 9.986};
        newNumber[2] = 9.986;
        for (int i = 2; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.print(newNumber[i]);
                break;
            }
            System.out.print(newNumber[i] + ", ");
        }
        System.out.println();

        int[] weight = {56, 58, 60, 62, 65, 63, 61, 59};
        weight[0] = 56;
        for (int i = 7; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задание 4");
        int [] arr = {1, 2, 3};
        arr [0] = 1;
        for (int i = 0; i < arr.length; i++)
            if (arr [i] % 2 == 0) {
            } else {
                arr [i]++;
            }
        System.out.println(Arrays.toString(arr));
    }
}