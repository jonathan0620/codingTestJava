package org.example.Hash;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (String[] c : clothes) {
            String kind = c[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }

        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        answer = answer-1;

        return answer;
    }
}
