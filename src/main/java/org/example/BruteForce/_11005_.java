package org.example.BruteForce;

import java.util.Scanner;

public class _11005_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        // 1. N을 B로 나눈 나머지를 구하고, B로 나누자
        // 2. 이때 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
        String ans = "";
        while (N > 0) { // 1. 을 N이 0보다 클 때 까지 반복
            int D = N % B; // 자릿값을 구함
            if (D < 10) ans += D; // D가 10보다 작다면 ans에 D를 붙이면 되고,
            else ans += (char)(D - 10 + 'A'); // D보다 크다면 알파벳 연산을 붙여줌. 알맞은 변환까지.
            N = N /B; // 다음 자릿수를 위해 N을 B로 나눈 몫을 구함
        }

        for (int i = ans.length() - 1; i >= 0; i--)
            System.out.print(ans.charAt(i));
        System.out.println();
    }
}
