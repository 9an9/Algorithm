/*
 * 1. 두 배열 합치기
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 * 예시 입력 1
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 * 예시 출력 1
 * 1 2 3 3 5 6 7 9
 */
package src.inflearn.twoPointersSlidingWindow;

import java.io.*;

public class TwoPointersSlidingWindow1 {
    public void solution(int n, String[] arr, int x, String[] arr2) throws IOException {
        int p = 0;
        int q = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(p!=n && q!=x) {
            if(Integer.parseInt(arr[p])<Integer.parseInt(arr2[q])) {
                bw.write(arr[p] + " ");
                p++;
            }else if(Integer.parseInt(arr[p])>Integer.parseInt(arr2[q])){
                bw.write(arr2[q] + " ");
                q++;
            }else if(Integer.parseInt(arr[p])==Integer.parseInt(arr2[q])) {
                bw.write(arr[p] + " ");
                bw.write(arr2[q] + " ");
                p++;
                q++;
            }
        }
        if(p==n) {
            for(int i=q;i<x;i++) {
                bw.write(arr2[i] + " ");
            }
        }
        if(q==x) {
            for(int i=p;i<n;i++) {
                bw.write(arr[i] + " ");
            }
        }


        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        TwoPointersSlidingWindow1 m = new TwoPointersSlidingWindow1();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int x = Integer.parseInt(bf.readLine());
        String[] arr2 = bf.readLine().split(" ");

        m.solution(n,arr,x,arr2);
    }
}
