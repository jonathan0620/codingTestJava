package org.example.Array;

import java.util.Scanner;

public class _10431_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();// 테스트 케이스 P를 받음 (테스트 케이스 수)
        // O(P) * O(N^2) - 시간 복잡도
        while (P-- > 0) { // P가 1씩 감소하면서 언젠간 0으로 갈거니까. P가 0보다 클 때까지. for (int p = 0l p < P; p++) 와 같은 말
            int T = sc.nextInt(); // 테스트 케이스 번호 T
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }
            int cnt = 0; // 물러난 횟수
            int[] sorted = new int[20]; // 정렬

            for (int i = 0; i < 20; i++) {
                // 앞에 있는 학생들부터 줄 세우기
                // 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
                // 1-1. 찾지 못 했다면, 줄의 가장 뒤에 선다.
                boolean find = false;
                for (int j = 0; j < i; j++)
                    if (sorted[j] > h[i]) {
                        // 2. 찾았다면, 그 학생의 앞에 선다.
                        // 3. 그 학생과 그 뒤의 학생이 모두 한 칸씩 물러난다.
                        find = true;
                        for (int k = i - 1; k >= j; k--) { // 뒤에 있는 학생부터
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                    if (!find) sorted[i] = h[i]; // 나보다 큰 친구가 없었다면(find가 false이면) i번 째 그대로 가서
                }
                System.out.println(T + " " + cnt);
            }
        }
    }

