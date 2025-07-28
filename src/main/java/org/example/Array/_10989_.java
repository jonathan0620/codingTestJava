package org.example.Array;

import java.util.Scanner;

public class _10989_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cnt = new int[10001];
        for (int i = 0; i < N; i++)
            cnt[sc.nextInt()]++;

        for (int i = 1; i <= 10000; i++)
            while (cnt[i]-- > 0){
                System.out.println(i);
            }
    }
}