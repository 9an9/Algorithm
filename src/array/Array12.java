/*
 * 12. 멘토링
 * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
 * 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
 * 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
 * 출력
 * 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
 * 예시 입력 1
 * 4 3
 * 3 4 1 2
 * 4 3 2 1
 * 3 1 4 2
 * 예시 출력 1
 * 3
 */
package src.array;

import java.io.*;
import java.util.*;

public class Array12 {
    public int solution(int n, int x, int[][] arr) {
        int answer = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<x; i++) {
            if(map.get(i) == null) {
                map.put(i, new ArrayList<>());
            }
            for(int j=0; j<n; j++) {
                map.get(i).add(arr[i][j]);
            }
        }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int a = 0;
                for(int k=0; k<x; k++) {
                    if(map.get(k).indexOf(j)>map.get(k).indexOf(i)) {
                        a++;
                    }
                }
                if(a == x) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Array12 m = new Array12();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        int[][] arr = new int[x][n];
        for(int i=0; i<x; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bf.close();
        System.out.println(m.solution(n, x, arr));
    }
}
