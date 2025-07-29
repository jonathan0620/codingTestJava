package org.example.Array;

import java.util.Scanner;

public class _3273_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001]; // 들어올 수 있는 ai의 크기로
        for (int i = 0; i < N; i++)
            exist[a[i]] = true;

        int ans = 0;
        for (int i = 1; i <= (X - i) / 2; i++){
            if (i <= 1000000 && X - 1 <= 1000000)
                ans += (exist[i] && exist[X - i]) ? 1: 0;
        }
        // 첫번째 풀이
//        for (int i = 0; i < N; i++) {
//            int pairValue = X = a[i];
//            if (0 <= pairValue && pairValue <= 1000000)
//                ans += exist[pairValue] ? 1 : 0;
//        }
        System.out.println(ans);
    }
}
