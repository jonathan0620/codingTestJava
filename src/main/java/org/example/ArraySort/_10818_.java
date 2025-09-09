package org.example.ArraySort;

import java.util.Scanner;

public class _10818_ {
    public static void main(String[] args) {
        // 입력을 받기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        // 정수 N (배열의 크기) 입력받기
        int N = sc.nextInt();
        // N개의 정수 배열 입력받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 최소값과 최대값을 저장할 변수를 초기화하기
        int max = arr[0];
        int min = arr[0];
        // 반복문을 돌면서 배열의 각 값을 확인
        for (int i = 1; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        // → 현재 값이 min보다 작으면 min 갱신
        // → 현재 값이 max보다 크면 max 갱신

        // 최소값과 최대값을 공백으로 구분해서 출력
        System.out.println(min + " " + max);
    }
}
