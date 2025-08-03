package org.example.BruteForce;

import java.util.Scanner;

public class _3058_ {
    public static int findMaxRow(char[][] map) {
        int N = map.length;
        int maxRow = 0;
        for (int r = 0; r < N; r++) {
            int len = 1; // 내가 보고있는 row의 길이. 이전 값을 이용한 영속성 판단
            for (int c = 1; c < N; c++) {
                if (map[r][c] == map[r][c - 1]) len++;
                else {
                    maxRow = Math.max(maxRow, len);
                    len = 1;
                }
            }
            maxRow = Math.max(maxRow, len);
        }
        return maxRow;
    }

    public static int findMaxColumn(char[][] map) {
        int N = map.length;
        int maxColumn = 0;
        for (int c = 0; c < N; c++) {
            int len = 1; // 내가 보고있는 column의 길이. 이전 값을 이용한 영속성 판단
            for (int r = 1; r < N; r++) {
                if (map[r][c] == map[r - 1][c]) len++;
                else {
                    maxColumn = Math.max(maxColumn, len);
                    len = 1;
                }
            }
            maxColumn = Math.max(maxColumn, len);
        }
        return maxColumn;
    }

    public static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            map[i] = sc.next().toCharArray();
        }

        int ans = 0;
        // 모든 사탕 교환
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 오른쪽
                if (j + 1 < N && map[i][j] != map[i][j + 1]) {
                    swapCandy(map, i, j, i, j + 1); // 처음에 자리 바꾸고
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map))); // 최댓값 찾아서
                    swapCandy(map, i, j, i, j + 1); // 원복
                }
                // 아래쪽
                if (i + 1 < N && map[i][j] != map[i + 1][j]) {
                    swapCandy(map, i, j, i + 1, j); // 처음에 자리 바꾸고
                    ans = Math.max(ans, Math.max(findMaxColumn(map), findMaxRow(map))); // 최댓값 찾아서
                    swapCandy(map, i, j, i + 1, j); // 원복
                }

            }
        }
        System.out.println(ans);
    }
}
