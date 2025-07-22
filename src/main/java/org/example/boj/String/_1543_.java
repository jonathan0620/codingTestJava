package org.example.boj.String;

import java.util.Scanner;

public class _1543_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int index = 0;
        int count = 0;

        while(true) {
            int found = a.indexOf(b, index); // b를 index부터 찾는다
            if (found < 0) break; // 더 이상 없으면 반복 종료
            count++; // 찾았으면 count 증가
            index = found + b.length(); // 내가 지금 찾은 단어의 뒤 부터 검색
        }

        System.out.println(count);


    }
}
