package org.example.ArraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2751_ {
    public static void main(String[] args) throws IOException {
        // 1. BufferedReader로 N(정수 개수) 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. 크기가 N인 int 배열 생성
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        // 3. N번 반복하면서 한 줄씩 정수를 읽어 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 4. Arrays.sort()로 배열을 오름차순 정렬
        //    - 중복 값이 있으면 그대로 유지 (중복 제거 안 함)
        Arrays.sort(arr);
        // 5. StringBuilder에 정렬된 배열 요소를 "\n"으로 구분해 추가
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append("\n");
        }
        // 6. StringBuilder 내용을 한 번에 출력
        System.out.print(sb);
    }
}
