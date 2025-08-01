package org.example.BruteForce;

import java.util.Scanner;
public class _10988_ {
        public static void main(String[] args) {
            // 1. Scanner를 이용해 입력을 받는다.
            Scanner sc = new Scanner(System.in);
            //    - 입력은 공백 없는 하나의 문자열
            String ch = sc.next();

            boolean isPalindrome = true;
            // 2. 문자열을 앞에서부터와 뒤에서부터 비교한다.
            //    - 예: left = 0, right = length - 1
            //    - 한 글자씩 비교하면서 다르면 팰린드롬 아님
            // 3. 끝까지 문제 없이 비교되면 팰린드롬임
            for (int i = 0; i < ch.length() / 2; i++) {
                if (ch.charAt(i) != ch.charAt(ch.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            // 4. 결과 출력
            //    - 팰린드롬이면 1 출력
            //    - 아니면 0 출력
            if (isPalindrome) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
