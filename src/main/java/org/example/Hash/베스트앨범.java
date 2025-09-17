package org.example.Hash;

import java.util.*;
public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];

            genreTotal.put(g, genreTotal.getOrDefault(g, 0) + p);

            genreSongs.putIfAbsent(g, new ArrayList<>());
            genreSongs.get(g).add(new int[]{i, p});
        }

        List<Map.Entry<String, Integer>> ordered =
                new ArrayList<>(genreTotal.entrySet());
        ordered.sort(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed());

        List<Integer> ans = new ArrayList<>();
        Comparator<int[]> playsDescIdxAsc = (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        };

        for (Map.Entry<String, Integer> e : ordered) {
            List<int[]> list = genreSongs.get(e.getKey());
            list.sort(playsDescIdxAsc);
            for (int k = 0; k < list.size() && k < 2; k++) ans.add(list.get(k)[0]);
        }

        int[] response = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) response[i] = ans.get(i);
        return response;
    }
}
