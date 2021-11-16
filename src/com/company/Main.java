package com.company;

public class Main {

    public static void main(String[] args) {
        
                int[] grades = {16, 23, 36, 41, 57, 62, 27, 81, 56, 32, 45, 18, 55, 64, 13, 28, 33, 48, 67, 75};
                System.out.println(grades);
                int myArray[] = {16, 23, 36, 41, 57, 62, 27, 81, 56, 32, 45, 18, 55, 64, 13, 28, 33, 48, 67, 75};
                int sum = 0;
                for (int i = 0; i < myArray.length; i++) {
                    sum = sum + myArray[i];
                }
                System.out.println(sum);

                if (sum % 2 == 0)
                    System.out.println("Число четное");
                else
                    System.out.println("Число нечетное");
    }
}
