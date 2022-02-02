package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] check = {0, 1, 2, 1, 0, 33, 20, 21};
        System.out.println(palindrome(check, 0, check.length - 1));

        System.out.println(recursiveSequential(check, 210, 0));

        int[] bits = new int[4];
        bitArrays(bits, 3);

    }

    //Homework 2:
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return factorial(n - 1) * n;
    }

    static void factorial_non_recursion(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++)
            answer *= i;
        System.out.println(answer);
    }

    //Homework 3:
    static int telephoneNumber(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return telephoneNumber(n - 1) + (n - 1) * telephoneNumber(n - 2);
    }

    static int telephoneNumber2(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            int nCurrent = 1;
            int fCurrent = 1;
            int fPrev = 1;
            while (nCurrent <= n) {
                int fNext = fCurrent + (nCurrent - 1) * fPrev;
                fPrev = fCurrent;
                fCurrent = fNext;
                nCurrent++;
            }
            return fCurrent;
        }
    }

    //Homework 4:
    static boolean recursiveSequential(int[] arrayToCheck, int key, int index) {
        if (index >= arrayToCheck.length)
            return false;
        if (arrayToCheck[index] == key)
            return true;
        else
            return recursiveSequential(arrayToCheck, key, index + 1);
    }

    //Homework 5:
    static boolean palindrome(int[] arrayToCheck, int start, int end) {
        if (start >= end)
            return true;
        if (arrayToCheck[start] == arrayToCheck[end])
            return palindrome(arrayToCheck, start + 1, end - 1);
        return false;
    }

    //Homework 6:
    static void bitArrays(int[] bits, int n) {
        if (n < 0) {
            System.out.println(java.util.Arrays.toString(bits));
            return;
        }
        for (bits[n] = 0; bits[n] <= 1; bits[n]++) {
            bitArrays(bits, n - 1);
        }
    }
}
