/*
 * 4. Least Recently Used
 * LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
 * 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.
 * 입력
 * 첫 번째 줄에 캐시의 크기인 S(3<=S<=10)와 작업의 개수 N(5<=N<=1,000)이 입력된다.
 * 두 번째 줄에 N개의 작업번호가 처리순으로 주어진다. 작업번호는 1 ~100 이다.
 * 출력
 * 마지막 작업 후 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례로 출력합니다.
 * 예시 입력 1
 * 5 9
 * 1 2 3 2 6 2 3 5 7
 * 예시 출력 1
 * 7 5 3 2 6
 */
package src.sortingSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SortingSearching4 {
    public void solution(int n, int x, int[] arr) throws IOException {

        List<Integer> cache = new ArrayList<>();
        int[] chk = new int[101];

        int cs = n;
        for(int i : arr) {
            if(cs != 0) {
                cache.add(i);
                cs--;
            }else if(chk[i]!=0) {
                cache.remove((Integer) i);
                cache.add(i);
            }else {
                chk[cache.get(0)] = 0;
                cache.remove(0);
                cache.add(i);
            }
            chk[i]++;
        }

        for(int i=cache.size()-1; i>=0; i-- ) {
            System.out.print(cache.get(i) + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        SortingSearching4 m = new SortingSearching4();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str.split(" ")[0]);
        int x = Integer.parseInt(str.split(" ")[1]);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[x];
        for(int i=0; i<x; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        m.solution(n, x, arr);
    }
}
