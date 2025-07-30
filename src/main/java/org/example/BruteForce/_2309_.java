package org.example.BruteForce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2309_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        // 1. 9명의 키 입력 + 전체 합계 구하기
        int totalSum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        // 2. 두 명 제외할 인덱스 찾기
        int exclude1 = -1;
        int exclude2 = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) { // j는 i+1부터 시작해야 같은 난쟁이 중복 X
                if (totalSum - arr[i] - arr[j] == 100) {
                    exclude1 = i;
                    exclude2 = j;
                    break;
                }
            }
            if (exclude1 != -1) break; // 이미 찾았으면 빠져나오기
        }
        // 3. 두 명 제외한 7명 저장
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            if (i == exclude1 || i == exclude2) continue; // 제외된 두 명은 건너뛰기
            list.add(arr[i]);
        }

        // 4. 7명의 키 정렬
        Collections.sort(list);

        // 5. 출력
        for (int height : list) {
            System.out.println(height);
        }
    }
}
