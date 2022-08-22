/*
 * 5. 소수(에라토스테네스 체)
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 입력
 * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 출력
 * 첫 줄에 소수의 개수를 출력합니다.
 * 예시 입력 1
 * 20
 * 예시 출력 1
 * 8
 */
package src.array;

import java.io.*;

public class Array5 {
    public int solution(int n) throws IOException {
//        int answer = 0;
//
//        for(int i=1; i<=n; i++) {
//            for(int j=2; j<=i; j++) {
//                if(j==i) {
//                    answer++;
//                }
//                if(i%j==0) {
//                    break;
//                }
//            }
//        }
//
//        return answer;

        int cnt=0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Array5 m = new Array5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(m.solution(n));
    }
}
