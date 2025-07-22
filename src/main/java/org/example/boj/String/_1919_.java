package org.example.boj.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1919_ {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i<str.length(); i++)
            count[str.charAt(i) - 'a']++;
        return count;
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int ans = 0;
        for (int i=0; i<26; i++)
            ans += Math.abs(countA[i] - countB[i]); // 대소 비교 하는 것과 같은 코드
        System.out.println(ans);
    }
}