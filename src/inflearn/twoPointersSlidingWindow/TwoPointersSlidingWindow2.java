/*
 * 2. 공통원소 구하기
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * 출력
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
 * 예시 입력 1
 * 5
 * 1 3 9 5 2
 * 5
 * 3 2 5 7 8
 * 예시 출력 1
 * 2 3 5
 */
package src.inflearn.twoPointersSlidingWindow;

import java.io.*;
import java.util.*;

public class TwoPointersSlidingWindow2 {

    public void solution(int n, int[] arr, int x, int[] arr2) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int p=0;
        int q=0;
        while(p<n && q<x) {
            if(arr[p]==arr2[q]) {
                bw.write(arr[p++] + " ");
                q++;
            }else if(arr[p]>arr2[q]) {
                q++;
            }else p++;
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        TwoPointersSlidingWindow2 m = new TwoPointersSlidingWindow2();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st1 = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        int x = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[x];
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i=0; i<x; i++) {
            arr2[i]=Integer.parseInt(st2.nextToken());
        }
        m.solution(n,arr,x,arr2);
    }
}
