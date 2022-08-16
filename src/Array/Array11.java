/*
 * 11. 임시반장 정하기
 * 김갑동 선생님은 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
 * 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
 * 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
 * 출력
 * 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 * 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
 * 예시 입력 1
 * 5
 * 2 3 1 7 3
 * 4 1 9 6 8
 * 5 5 2 4 4
 * 6 5 2 6 7
 * 8 4 2 2 2
 * 예시 출력 1
 * 4
 */
package src.Array;

import java.io.*;
import java.util.*;

public class Array11 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int[] rslt = new int[n];
        for(int i=0; i<5; i++) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for(int j=0; j<n; j++) {
                if(map.get(arr[j][i]) == null) {
                    map.put(arr[j][i], new ArrayList<>());
                }
                map.get(arr[j][i]).add(j);
            }
            for(int item : map.keySet()) {
                if(map.get(item).size()>1) {
                    for(int m : map.get(item)){
                        rslt[m]++;
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(rslt[i]>max) {
                max = rslt[i];
                answer = i+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array11 m = new Array11();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        System.out.println(m.solution(n, arr));
    }
}
