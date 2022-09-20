package src.programmers.hash;

import java.util.*;

public class Hash5 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;

        Map<String, List<Integer>> map = new HashMap<>();
        Map<String, Integer> cnt = new HashMap<>();


        for(int i=0; i<genres.length; i++) {
            String genre = genres[i];
            //장르별 재생횟수 합
            cnt.put(genre, cnt.getOrDefault(genre, 0) + plays[i]);

            map.putIfAbsent(genre, new ArrayList<>());
            map.get(genre).add(i);

        }
        answer = new int[map.size()*2];
        for(String str : map.keySet()) {

        }


        return answer;
    }
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        Hash5 m = new Hash5();
        System.out.println(m.solution(genres, plays));
    }
}
