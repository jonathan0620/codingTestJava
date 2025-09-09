package org.example.Array;

import java.util.Scanner;

public class _1546_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum += x;
            if (x > max) max = x;
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
