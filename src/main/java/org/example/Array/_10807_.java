package org.example.Array;

import java.util.Scanner;

public class _10807_ {
    public static void main(String[] args) {
        // 1. Scanner를 사용해서 입력을 받을 준비를 한다.
        Scanner sc = new Scanner(System.in);

        // 2. 정수 N을 입력받는다. (배열의 길이)
        int N = sc.nextInt();
        // 3. 길이가 N인 정수 배열을 만든다.
        int[] a = new int[N];
        // 4. 반복문을 사용해서 배열에 정수들을 채운다.
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        // 5. 찾고자 하는 정수 v를 입력받는다.
        int V = sc.nextInt();

        // 6. v가 몇 번 나왔는지 세기 위한 count 변수를 만든다.
        int count = 0;
        // 7. 배열을 하나씩 확인하면서, 현재 값이 v와 같다면 count를 증가시킨다.
        for (int i = 0; i <  N; i++) {
            if (a[i] == V){
                count++;
            }
        }
        // 8. 최종적으로 count 값을 출력한다.
        System.out.println(count);
    }
}