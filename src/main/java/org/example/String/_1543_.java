package org.example.String;

import java.util.Scanner;

public class _1543_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, ""); // word를 모두 제거한 것을 반환
        int length = doc.length() - replaced.length();
        int count = length / word.length();

        System.out.println(count);
    }
}
