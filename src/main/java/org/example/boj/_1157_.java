package org.example.boj;

import java.util.Scanner;

public class _1157_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toUpperCase(); // 대문자로 변환해서 통일

        int[] count = new int[26]; // 알파벳 개수 배열

        // 알파벳 개수 세기
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'A']++;
        }

        int max = -1;
        char result = '?';

        // 가장 많이 나온 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char)(i + 'A'); // 인덱스를 문자로 변환
            } else if (count[i] == max) {
                result = '?'; // 중복이면 ?로 처리
            }
        }

        System.out.println(result);
    }
}
