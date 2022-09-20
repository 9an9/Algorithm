// 폰켓몬
package src.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        if(map.size()>nums.length/2) {
            answer = nums.length/2;
        }else answer = map.size();

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,3};

        Hash2 m = new Hash2();
        System.out.println(m.solution(nums));
    }
}
