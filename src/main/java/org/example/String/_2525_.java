package org.example.String;

import java.util.Scanner;

public class _2525_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cook = sc.nextInt();

        int totalMin = hour * 60 + minute + cook;

        int resultHour = (totalMin/60) % 24; // 24시 이상이면 0으로 돌아가야 함
        int resultMin = totalMin % 60;

        System.out.println(resultHour+ " " + resultMin);
    }
}
