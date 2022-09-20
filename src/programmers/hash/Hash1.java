// 완주하지 못한 선수
package src.programmers.hash;

import java.util.*;

public class Hash1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();
        for(String str : participant) {
            map.put(str, map.getOrDefault(str,0)+1);
        }
        for(String str : completion) {
            map.put(str, map.get(str)-1);
            if(map.get(str)<1) {
                map.remove(str);
            }
        }
        for(String str : map.keySet()) {
            answer = str;
        }



        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        Hash1 m = new Hash1();
        System.out.println(m.solution(participant, completion));
    }
}
