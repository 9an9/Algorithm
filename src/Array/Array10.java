/*
 * 10. 봉우리
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 출력
 * 봉우리의 개수를 출력하세요.
 * 예시 입력 1
 * 5
 * 5 3 7 2 3
 * 3 7 1 6 1
 * 7 2 5 3 4
 * 4 3 6 4 1
 * 8 7 3 5 2
 * 예시 출력 1
 * 10
 */
package src.Array;

import java.io.*;
import java.util.StringTokenizer;

public class Array10 {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array10 m = new Array10();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n+2][n+2];
        for(int i=1; i<n+1; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=1; j<n+1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        System.out.println(m.solution(n, arr));
    }
}
