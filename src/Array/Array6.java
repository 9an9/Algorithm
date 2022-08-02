/*
 * 6. 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 * 입력
 * 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * 각 자연수의 크기는 100,000를 넘지 않는다.
 * 출력
 * 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * 예시 입력 1
 * 9
 * 32 55 62 20 250 370 200 30 100
 * 예시 출력 1
 * 23 2 73 2 3
 */
package src.Array;

import java.io.*;

public class Array6 {
    public void solution(int n, String str) throws IOException {

        String[] arr = str.split(" ");

        int[] ch = new int[100001];
        for(int i=2; i<=100000; i++){
            if(ch[i]==0){
                for(int j=i+i; j<=100000; j=j+i) ch[j]=1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String item : arr) {
            int x = Integer.parseInt(new StringBuilder(item).reverse().toString());
            if(x!=1 && ch[x] == 0) {
                bw.write(x + " ");
            }
        }

        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Array6 m = new Array6();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str = bf.readLine();

        m.solution(n,str);
    }
}
