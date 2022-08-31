/*
 * 6. 공주 구하기
 * 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
 * 그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
 * 그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
 * 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
 * N과 K가 주어질 때 공주를 구하러 갈 왕자의 번호를 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫 줄에 자연수 N(5<=N<=1,000)과 K(2<=K<=9)가 주어진다.
 * 출력
 * 첫 줄에 마지막 남은 왕자의 번호를 출력합니다.
 * 예시 입력 1
 * 8 3
 * 예시 출력 1
 * 7
 */
package src.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueue6 {

    public int solution(int n, int x) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        int num = 1;
        for(int i=1; i<n+1; i++) {
           queue.add(i);
        }
        while(queue.size()>1) {
            if(num!=x) {
                queue.add(queue.poll());
                num++;
            }else {
                queue.poll();
                num=1;
            }
        }

        answer = queue.poll();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue6 m = new StackQueue6();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);

        System.out.println(m.solution(n, x));
    }
}
