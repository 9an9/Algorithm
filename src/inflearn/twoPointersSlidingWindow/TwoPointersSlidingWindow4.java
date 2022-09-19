/*
 * 4. 연속 부분수열
 * N개의 수로 이루어진 수열이 주어집니다.
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 * 1 2 1 3 1 1 1 2
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 * 입력
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * 출력
 * 첫째 줄에 경우의 수를 출력한다.
 * 예시 입력 1
 * 8 6
 * 1 2 1 3 1 1 1 2
 * 예시 출력 1
 * 3
 */
package src.inflearn.twoPointersSlidingWindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointersSlidingWindow4 {


    public int solution(int n, int m, int[] arr) {
        int answer=0, sum=0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=arr[rt];
            if(sum==m) answer++;
            while(sum>=m){
                sum-=arr[lt++];
                if(sum==m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersSlidingWindow4 m = new TwoPointersSlidingWindow4();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int x = Integer.parseInt(s.split(" ")[1]);
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n;i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, x, arr));
    }
}
