//위장
package src.programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hash4 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for(String[] arr : clothes) {
            map.put(arr[1], map.getOrDefault(arr[1],0)+1);
        }

        for(int i : map.values()) {
            answer *= i+1;
        }

        return answer-1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Hash4 m = new Hash4();
        System.out.println(m.solution(clothes));
    }
}
