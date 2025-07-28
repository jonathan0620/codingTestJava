package org.example.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2742_ {
    public static void main(String[] args) throws IOException {
        // 1. BufferedReader를 사용해서 입력을 빠르게 받는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. 입력받은 한 줄(String)을 정수(int)로 변환해서 N 저장
        int N = Integer.parseInt(br.readLine());
        // 3. StringBuilder를 선언해서 결과를 누적할 공간 준비
        StringBuilder sb = new StringBuilder();

        // 4. N부터 1까지 반복문(for문) 돌리면서
        for (int i = N; i >= 1; i--) {
            // 4-1. i 값을 StringBuilder에 append
            // 4-2. 줄바꿈을 위해 append("\n") 추가
            sb.append(i).append("\n");
        }

        // 5. 반복문 끝나면, StringBuilder 내용을 System.out.print()로 한 번에 출력
        System.out.println(sb);
    }
}