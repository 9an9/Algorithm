/*
 * 1. 선택 정렬
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 선택정렬입니다.
 * 데이터가 무작위로 여러 개 있다고 가정하자. 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고,
 * 그 다음 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 과정을 반복한다. O(N²)
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 * 예시 입력 1
 * 6
 * 13 5 11 7 23 15
 * 예시 출력 1
 * 5 7 11 13 15 23
 */
package src.inflearn.sortingSearching;

import java.io.*;
import java.util.StringTokenizer;

public class SortingSearching1 {

    public void solution(int n, int[] arr) throws IOException {

        int min = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
            min = i+1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        SortingSearching1 m = new SortingSearching1();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        m.solution(n, arr);
    }
}
