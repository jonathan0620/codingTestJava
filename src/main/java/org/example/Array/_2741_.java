package org.example.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _2741_ {
    public static void main(String[] args) throws IOException {
        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. 출력 누적할 StringBuilder
        StringBuilder sb = new StringBuilder();

        // 3. 1부터 N까지 반복하면서 줄마다 추가
        for (int i = 1; i <= N; i++) {
            sb.append(i).append("\n");
        }

        // 4. 한 번에 출력
        System.out.println(sb);
    }
}