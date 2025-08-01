package org.example.BruteForce;

import java.util.Scanner;

public class _11068_ {
    public static int[] convertBase(int x, int B) {
        int len = 0, copyX = x;
        while (copyX > 0) {
            copyX /= B;
            len++;
        }
        int[] digit = new int[len];
        len = 0;
        while (x > 0) {
            digit[len++] = x % B;
            x = x / B;
        }
        return digit;
    }

    public static boolean isPalindrom(int[] digit) {
        for (int i = 0; i < digit.length / 2; i++)
            if (digit[i] != digit[digit.length - i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            boolean ans = false;
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x, i);
                if (isPalindrom(digit)) {
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "1" : "0");
        }
    }
}
