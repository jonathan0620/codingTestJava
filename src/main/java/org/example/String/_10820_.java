package org.example.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _10820_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int lower = 0;
            int upper = 0;
            int digit = 0;
            int space = 0;

            for (char ch : line.toCharArray()) {
                if (Character.isLowerCase(ch)) lower++;
                else if (Character.isUpperCase(ch)) upper++;
                else if (Character.isDigit(ch)) digit++;
                else if (ch == ' ') space++;
            }

            System.out.println(lower + " " + upper + " " + digit + " " + space);
        }
    }
}