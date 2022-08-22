/*
 * 3. 매출액의 종류
 * 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 * 출력
 * 첫 줄에 각 구간의 매출액 종류를 순서대로 출력합니다.
 * 예시 입력 1
 * 7 4
 * 20 12 20 10 23 17 10
 * 예시 출력 1
 * 3 4 4 3
 */
package src.hash;

import java.io.*;
import java.util.*;

public class Hash3 {
    public void solution(int n, int x, int[] arr) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n-x+1; i++) {
            for(int j=i; j<i+x; j++) {
                set.add(arr[j]);
            }
            bw.write(set.size() + " ");
            set = new HashSet<>();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Hash3 m = new Hash3();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        m.solution(n,x,arr);
    }
}
