/*
 * 6. 최대 길이 연속부분수열
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다.
 * 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다.
 * 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 * 출력
 * 첫 줄에 최대 길이를 출력하세요.
 * 예시 입력 1
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 예시 출력 1
 * 8
 */
package src.twoPointersSlidingWindow;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointersSlidingWindow6 {
    public int solution(int n, int x, int[] arr) throws IOException {
        int answer=0, cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>x){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersSlidingWindow6 m = new TwoPointersSlidingWindow6();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n,x,arr));
    }
}
