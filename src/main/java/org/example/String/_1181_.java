package org.example.String;

import java.io.*;
import java.util.*;
public class _1181_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 1) 입력 & 2) 중복 제거
        // HashSet으로 중복 제거 후 List로 변환
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> words = new ArrayList<>(set);

        // 3) 길이 → 사전순 정렬
        words.sort(Comparator
                .comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        // 4) 출력
        StringBuilder sb = new StringBuilder();
        for (String w : words) sb.append(w).append('\n');
        System.out.print(sb.toString());
    }
}

