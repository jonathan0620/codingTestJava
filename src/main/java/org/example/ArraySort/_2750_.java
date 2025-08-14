package org.example.ArraySort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _2750_ {
    public static void main(String[] args) {
        // 1. Scanner 또는 BufferedReader로 N(정수 개수) 입력받기
        Scanner sc = new Scanner(System.in);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = sc.nextInt();
        // 2. 크기가 N인 int 배열 생성
        int[] arr = new int[N];
        // 3. N번 반복하면서 배열에 정수 입력받아 저장
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 4. Arrays.sort()를 사용해 배열을 오름차순 정렬
        Arrays.sort(arr);
        // 5. 정렬된 배열을 순서대로 출력 (System.out.println 사용)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
