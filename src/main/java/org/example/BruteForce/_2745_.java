package org.example.BruteForce;

import java.util.Scanner;

public class _2745_ {
    public static void main(String[] args) {
        // 1. Scanner로 문자열 N과 진법 B 입력받기
        Scanner sc = new Scanner(System.in);
        String N = sc.next(); // "ZZZZZ"
        int B = sc.nextInt(); // 36

        int result = 0; // 누적합을 저장할 변수

        // 2. 문자열 N을 왼쪽부터 한 글자씩 순회
        for (int i = 0; i < N.length(); i++){
            char ch = N.charAt(i);
            int value;
            //    - ch 문자가 숫자면 '0' 빼서 정수로 변환
            //    - ch 문자가 알파벳이면 'A' 빼고 10 더해서 변환
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            // 3. 각 자리값 * B의 (자리수 거듭제곱) 만큼 곱해서 누적합에 더하기
            result = result * B + value;
        }
        // 4. 결과 출력
        System.out.println(result);
    }
}
