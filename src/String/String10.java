/*
 * 10. 가장 짧은 문자거리
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 * 예시 입력 1
 * teachermode e
 * 예시 출력 1
 * 1 0 1 2 1 0 1 2 2 1 0
 */
package src.String;

import java.io.*;

public class String10 {

    public void solution(String str) throws IOException {
        String s = str.split(" ")[0];
        char t = str.split(" ")[1].charAt(0);
        char[] arr = s.toCharArray();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<s.length(); i++) {
            int l = i;
            int r = i;
            int num = 0;
            while(true) {
                if(l>=0 && arr[l]==t) {
                    bw.write(num + " ");
                    break;
                }else if(r<=arr.length-1 && arr[r]==t) {
                    bw.write(num + " ");
                    break;
                }else {
                    l--;
                    r++;
                    num++;
                }
            }
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        String10 m = new String10();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        m.solution(str);
    }
}
