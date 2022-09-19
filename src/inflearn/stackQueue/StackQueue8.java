/*
 * 8. 응급실
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
 * 두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
 * 위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.
 * 출력
 * M번째 환자의 몇 번째로 진료받는지 출력하세요.
 * 예시 입력 1
 * 5 2
 * 60 50 70 80 90
 * 예시 출력 1
 * 3
 * 예시 입력 2
 * 6 3
 * 70 60 90 60 60 60
 * 예시 출력 2
 * 4
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackQueue8 {

    public int solution(int n, int x, Integer[] arr) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++) {
            map.put(i, arr[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());
        Queue<Integer> queue1 = new LinkedList<>();
        for(int i : arr) {
            queue1.add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            queue.add(i);
        }

        while(true) {
            if(map.get(queue.peek()) != queue1.peek()) {
                queue.add(queue.poll());
            }else {
                if(queue.peek() == x) {
                    answer++;
                    break;
                }
                queue.poll();
                queue1.poll();
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue8 m = new StackQueue8();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        System.out.println(m.solution(n, x, arr));
    }
}
