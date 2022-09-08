/*
 * 9. 뮤직비디오(결정알고리즘)
 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
 * 고민 끝에 지니레코드는 M개의 DVD에 모든 동영상을 녹화하기로 하였다.
 * 이 때 DVD의 크기(녹화 가능한 길이)를 최소로 하려고 한다.
 * 그리고 M개의 DVD는 모두 같은 크기여야 제조원가가 적게 들기 때문에 꼭 같은 크기로 해야 한다.
 * 입력
 * 첫째 줄에 자연수 N(1≤N≤1,000), M(1≤M≤N)이 주어진다.
 * 다음 줄에는 조영필이 라이브에서 부른 순서대로 부른 곡의 길이가 분 단위로(자연수) 주어진다.
 * 부른 곡의 길이는 10,000분을 넘지 않는다고 가정하자.
 * 출력
 * 첫 번째 줄부터 DVD의 최소 용량 크기를 출력하세요.
 * 예시 입력 1
 * 9 3
 * 1 2 3 4 5 6 7 8 9
 * 예시 출력 1
 * 17
 */
package src.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortingSearching9 {

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for(int i : arr) {
            if(sum + i > capacity) {
                cnt++;
                sum = i;
            }else sum += i;
        }
        return cnt;
    }

    public int solution(int n, int x, int[] arr) {
        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt) {
            int mid = (lt+rt)/2;

            if(count(arr, mid)<=x) {
                answer = mid;
                rt = mid - 1;
            }else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        SortingSearching9 m = new SortingSearching9();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n, x, arr));
    }
}
