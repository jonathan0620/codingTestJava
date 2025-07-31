package org.example.BruteForce;

import java.util.Scanner;
public class _11005_prac {

    public static void main(String[] args) {
        // 1. Scanner로 정수 N과 진법 B 입력받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        // 2. 결과를 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 3. N이 0보다 클 동안 반복:
        while (N > 0) {
            //    3-1. 나머지 = N % B
            int ans = N % B;
            //    3-2. 나머지가 10 미만이면 숫자로 append
            if (ans < 10) {
                sb.append(ans);
            } else {
                //    3-3. 나머지가 10 이상이면 'A'부터 시작하는 문자로 변환하여 append
                sb.append((char) (ans - 10 + 'A'));
            }
            //    3-4. N을 B로 나누기
            N = N / B;
        }
        // 4. StringBuilder 뒤집어서 출력
        System.out.println(sb.reverse());
    }
}