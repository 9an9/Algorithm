/*
 * 7. 점수계산
 * 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.
 * 1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
 * 또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.
 * 입력
 * 첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
 * 0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.
 * 출력
 * 첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.
 * 예시 입력 1
 * 10
 * 1 0 1 1 1 0 0 1 1 0
 * 예시 출력 1
 * 10
 */
package src.inflearn.array;

import java.io.*;

public class Array7 {
    public int solution(int n, String str){
        int answer = 0;

        String[] arr = str.split(" ");
        int cnt = 1;
        for(String i : arr) {
            if(Integer.parseInt(i) == 1) {
                answer += cnt;
                cnt++;
            }else {
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array7 m = new Array7();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        System.out.println(m.solution(n,str));
    }
}
