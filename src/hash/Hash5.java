/*
 * 5. K번째 큰 수
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 * 출력
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 * 예시 입력 1
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 * 예시 출력 1
 * 143
 */
package src.hash;

import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Hash5 {
    public int solution(int n, int x, Integer[] arr) throws IOException {
        int answer= 0;

        Arrays.sort(arr, Collections.reverseOrder());


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Hash5 m = new Hash5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n,x,arr));
    }
}
