// 베스트앨범
package src.programmers.hash;

import java.util.*;

public class Hash5 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;

        Map<String, List<Integer>> map = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
            map.putIfAbsent(genres[i], new ArrayList<>());
            map.get(genres[i]).add(i);
        }
        for(List<Integer> list : map.values()) {
            list.sort((a,b)-> {
                if(plays[a]==plays[b]) {
                    return a-b;
                }else return plays[b]-plays[a];

            });
        }

        Map<String,Integer> cnt = new HashMap<>();
        for(int i=0; i<genres.length; i++) {
            cnt.put(genres[i], cnt.getOrDefault(genres[i], 0) + plays[i]);
        }
        String[] arr = cnt.keySet().toArray(new String[cnt.size()]);
        Arrays.sort(arr, (a,b)-> cnt.get(b)-cnt.get(a));

        List<Integer> list = new ArrayList<>();
        for(String str : arr) {
            int i=0;
            while (i<map.get(str).size() && i<2) {
                list.add(map.get(str).get(i++));
            }
        }
        answer = new int[list.size()];
        for(int i=0; i< list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "jpop"};
        int[] plays = {500, 600, 150, 800, 2500, 3000};

        Hash5 m = new Hash5();
        System.out.println(m.solution(genres, plays));
    }
}
