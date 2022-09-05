/*
 * 5. 중복 확인
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
 * N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 자연수 N(5<=N<=100,000)이 주어진다.
 * 두 번째 줄에 학생들이 적어 낸 N개의 자연수가 입력된다.
 * 출력
 * 첫 번째 줄에 D 또는 U를 출력한다.
 * 예시 입력 1
 * 8
 * 20 25 52 30 39 33 43 33
 * 예시 출력 1
 * D
 */
package src.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortingSearching5 {
    public String solution(int n, int[] arr) throws IOException {

        String answer = "U";
        int[] cnt = new int[10000001];
        for(int i : arr) {
            cnt[i]++;
        }
        for(int i : cnt) {
            if(i>1) answer = "D";
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        SortingSearching5 m = new SortingSearching5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, arr));
    }
}
