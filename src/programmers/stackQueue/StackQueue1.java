// 같은 숫자는 싫어
package src.programmers.stackQueue;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackQueue1 {
    public int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            if(i==0||(list.size()>0 && list.get(list.size()-1)!= arr[i])){
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        StackQueue1 m = new StackQueue1();
        System.out.println(m.solution(arr));
    }
}
