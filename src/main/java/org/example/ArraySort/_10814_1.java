package org.example.ArraySort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _10814_1 {

    static class Member {
        int age;
        String name;
        int order; // 입력 순서

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) throws IOException {
        // 1. BufferedReader로 입력을 빠르게 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. 첫 줄에서 회원 수 N 읽기
        int N = Integer.parseInt(br.readLine());
        // 3. Member(나이, 이름) 정보를 저장할 리스트 또는 배열 준비
        List<Member> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            //    4-1. 한 줄을 읽어서 나이(int)와 이름(String)으로 분리
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            //    4-2. Member 객체 또는 [나이, 이름] 형태로 저장
            list.add(new Member(age, name, i)); // 입력 순서 유지
        }
        // 4. N번 반복하면서
        // 5. 리스트/배열을 정렬하기
        list.sort((a, b) -> {
            //    - 기본 키: 나이 오름차순
            //    - 같은 나이일 경우 입력 순서를 그대로 유지 (안정 정렬 사용)
            if (a.age != b.age) {
                return a.age - b.age; // 오름차순
            } else {
                return a.order - b.order; // 오름차순
            }
        });
        // 6. 정렬된 결과를 StringBuilder에 "나이 이름\n" 형태로 누적
        StringBuilder sb = new StringBuilder();
        for (Member m : list) {
            sb.append(m.age).append(" ").append(m.name).append("\n");
        }
        // 7. StringBuilder 내용을 한 번에 출력
        System.out.println(sb);

    }
}
