/*
 * 9. 격자판 최대합
 * 5*5 격자판 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 출력
 * 최대합을 출력합니다.
 * 예시 입력 1
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * 예시 출력 1
 * 155
 */
package src.Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array9 {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        int sum = 0;
        //행
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum += arr[i][j];
            }
            if(answer<sum) {
                answer = sum;
            }
            sum = 0;
        }
        //열
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sum += arr[j][i];
            }
            if(answer<sum) {
                answer = sum;
            }
            sum = 0;
        }
        //대각선
        for(int i=0; i<n; i++) {
            sum += arr[i][i];
        }
        if(sum>answer) {
            answer=sum;
        }
        sum=0;
        for(int i=0; i<n; i++) {
            sum+=arr[n-1-i][i];
        }
        if(sum>answer) {
            answer=sum;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array9 m = new Array9();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        System.out.println(m.solution(n, arr));
    }
}
