// 프린터
package src.programmers.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue3 {
    public int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Integer> queue = new LinkedList<>();
        for(int i : priorities) {
            queue.add(i);
        }
        int idx = 0;
        int lct = location;
        while(queue.size()>0) {
            int p = queue.poll();
            for(int i : queue) {
                if(p<i) {
                    if(idx == lct) {
                        lct =
                    }
                    queue.add(p);
                    break;
                }
                idx++;
            }
            return answer;
        }


        return answer;
    }

    public static void main(String[] args) {
        StackQueue3 m = new StackQueue3();

        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        System.out.println(m.solution(priorities, location));
    }

}
