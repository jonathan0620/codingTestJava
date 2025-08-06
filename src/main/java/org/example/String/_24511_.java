package org.example.String;

import java.util.*;

public class _24511_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 자료구조 개수

        int[] type = new int[N];        // 큐(0)인지 스택(1)인지
        for (int i = 0; i < N; i++) {
            type[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            if (type[i] == 0) {
                deque.addLast(val);  // 큐면 삽입
            }
        }

        int M = sc.nextInt();  // 삽입할 값 개수
        int[] input = new int[M];
        for (int i = 0; i < M; i++) {
            input[i] = sc.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            deque.addFirst(input[i]);             // 새로 넣을 값을 앞에 추가
            sb.append(deque.pollLast()).append(" "); // 뒤에서 하나 꺼내기
        }

        System.out.println(sb.toString().trim());
    }
}
