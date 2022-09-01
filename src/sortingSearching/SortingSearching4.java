/*
 * 1. 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 입력
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출력
 * 첫 번째 줄에 YES, NO를 출력한다.
 * 예시 입력 1
 * (()(()))(()
 * 예시 출력 1
 * NO
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
