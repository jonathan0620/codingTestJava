package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 테스트용 입력 파일 연결 (백준 제출 전 주석 처리!)
        System.setIn(new FileInputStream("input.txt"));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);
    }
}
