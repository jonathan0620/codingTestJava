package org.example.Array;

import java.util.Scanner;

public class _10871_ {
    public static void main(String[] args) {
        // 1. Scanner를 이용해서 입력을 받을 준비를 한다.
        Scanner sc = new Scanner(System.in);
        // 2. 정수 N과 기준값 X를 입력받는다.
        int N = sc.nextInt();
        int X = sc.nextInt();
        // 3. 크기 N짜리 정수 배열을 만든다.
        int[] A = new int[N];
        // 4. N개의 정수를 입력받아서 배열에 저장한다.
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // 5. 배열을 하나씩 돌면서, 현재 값이 X보다 작으면 출력한다.
        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                // 6. 출력할 때는 공백으로 구분해서 한 줄로 출력한다.
                System.out.print(A[i] + " ");
            }
        }
    }
}
