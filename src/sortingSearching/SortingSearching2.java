/*
 * 2. 버블 정렬
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 버블정렬입니다.
 * 1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
 * 2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
 * 3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.O(N2)/O(N)
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

public class SortingSearching2 {
    public void solution(int n, int[] arr) throws IOException {

        int min = 0;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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
