/*
 * 8. 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * 입력
 * 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * 출력
 * 입력된 순서대로 등수를 출력한다.
 * 예시 입력 1
 * 5
 * 87 89 92 100 76
 * 예시 출력 1
 * 4 3 2 1 5
 */
package src.Array;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Array8 {
    public void solution(int n, String str) throws IOException {
        int answer = 0;

        String[] arr = str.split(" ");

        List<Integer> arr1 =  Arrays.stream(arr).map((a)->Integer.parseInt(a)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int[] grd = new int[n];
        for(int i=0; i<n; i++) {
            grd[i]= arr1.indexOf(Integer.parseInt(arr[i]))+1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i : grd) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Array8 m = new Array8();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        m.solution(n,str);
    }
}
