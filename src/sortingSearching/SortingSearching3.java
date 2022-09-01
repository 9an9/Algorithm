/*
 * 3. 삽입 정렬
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 삽입정렬입니다.
 * 1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
 * 2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
 * 3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
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
package src.sortingSearching;

import java.io.*;
import java.util.StringTokenizer;

public class SortingSearching3 {
    public void solution(int n, int[] arr) throws IOException {

        for(int i = 1; i < n; i++) {
            int t = arr[i];
            for(int j = i-1; j >= 0; j--) {
                if(t < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : arr) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        SortingSearching3 m = new SortingSearching3();

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
