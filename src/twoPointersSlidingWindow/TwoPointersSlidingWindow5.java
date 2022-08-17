/*
 * 5. 연속된 자연수의 합
 * 수 N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 * 출력
 * 첫 줄에 총 경우수를 출력합니다.
 * 예시 입력 1
 * 15
 * 예시 출력 1
 * 3
 */
package src.twoPointersSlidingWindow;

import java.io.*;

public class TwoPointersSlidingWindow5 {
    public void solution(int n, String str) throws IOException {
        String answer = "";

        String[] num = str.split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nm = Integer.parseInt(num[0]);
        bw.write(nm + " ");
        for(String item : num) {
            int t = Integer.parseInt(item);
            if(t>nm) {
                bw.write(t + " ");
            }
            nm = t;
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        TwoPointersSlidingWindow5 m = new TwoPointersSlidingWindow5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        m.solution(n,str);
    }
}
