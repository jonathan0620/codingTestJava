package org.example.Array;

import java.util.Scanner;

public class _1236_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M]; // 2차원 이상이면 캐릭터 어레이로 받자
        for (int i = 0; i < N; i++){
            map[i] = sc.next().toCharArray();
        }

        // 1. 각 행/열에 대해 경비원이 있는지 확인한다.
        boolean[] existRow = new boolean[N];
        boolean[] existCol = new boolean[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                if (map[i][j] == 'X') { // 경비원은 X니까
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        } // O( N * M )

        // 2. 보호받지 못하는 행/열의 갯수를 구한다.
        int needRowCount = N;
        int needColCount = M;

        // O(N)
        for (int i = 0; i<N; i++)
            if (existRow[i]) needRowCount--;
        // O(M)
        for (int i = 0; i<M; i++)
            if (existCol[i]) needColCount--;

        // O(N*M) + O(N*M) + O(N) + O(M) => O(NM)

        // 3. 둘 중 큰 값을 출력한다.
        System.out.println(Math.max(needRowCount, needColCount));
    }
}
