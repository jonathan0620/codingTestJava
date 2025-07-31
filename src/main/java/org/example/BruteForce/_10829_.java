package org.example.BruteForce;

import java.util.Scanner;
public class _10829_ {
    public static void main(String[] args) {
        // 1. Scanner로 long형 숫자 하나 입력받기
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        // 2. 결과를 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // (보너스) 입력값이 0인 경우 예외 처리도 고려해보기
        if (N == 0){
            System.out.println(0);
            return;
        }

        // 3. 숫자가 0보다 클 동안 반복:
        while (N > 0) {
            //    3-1. 2로 나눈 나머지를 구해서
            long D = N % 2;
            //    3-2. StringBuilder에 추가
            sb.append(D);
            //    3-3. 숫자를 2로 나누기
            N = N / 2;
        }
        // 4. StringBuilder를 뒤집고 출력
        System.out.println(sb.reverse());
    }
}
