/*
 * 6. 장난꾸러기
 * 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
 * 제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.
 * 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.
 * 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
 * 차례로 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 자연수 N(5<=N<=100)이 주어진다.
 * 두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다.
 * 키(높이) 값 H는 (120<=H<=180)의 자연수 입니다.
 * 출력
 * 첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력합니다.
 * 예시 입력 1
 * 9
 * 120 125 152 130 135 135 143 127 160
 * 예시 출력 1
 * 3 8
 */
package src.inflearn.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortingSearching6 {
    public void solution(int n, int[] arr) throws IOException {

        int[] num = new int[2];
        int cnt = 0;
        for(int i=0; i<n-1; i++) {
            if(arr[i]>arr[i+1] && num[0] == 0) {
                num[0]=i+1;
            }else if(arr[i]>arr[i+1] && num[0] !=0) {
                num[1] = i+2;
                cnt = 0;
            }else if(arr[i]==arr[i+1] && num[0] == 0) {
                num[0] = i+1;
                cnt++;
            }else if(arr[i]<arr[i+1] && cnt>0) {
                num[0] = 0;
                cnt = 0;
            }
        }

        for(int i : num) {
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) throws IOException {
        SortingSearching6 m = new SortingSearching6();

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
