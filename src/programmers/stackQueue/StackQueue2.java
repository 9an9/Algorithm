// 기능개발
package src.programmers.stackQueue;

import java.util.*;

public class StackQueue2 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i< progresses.length; i++) {
            int a = (100-progresses[i])/speeds[i];
            int day = (100-progresses[i])%speeds[i]==0 ? a : a+1;
            queue.add(day);
        }

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int num = 0;
        while (queue.size()>0){
            if(queue.peek()<=num) {
                map.put(num, map.getOrDefault(num, 0)+1);
                queue.poll();
            }else {
                num = queue.poll();
                map.put(num, 1);
                list.add(num);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = map.get(list.get(i));
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        StackQueue2 m = new StackQueue2();
        System.out.println(m.solution(progresses, speeds));
    }

}
