/*
 * 11. 문자열 압축
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 * 예시 입력 1
 * KKHSSSSSSSE
 * 예시 출력 1
 * K2HS7E
 * 예시 입력 2
 * KSTTTSEEKFKKKDJJGG
 * 예시 출력 2
 * KST3SE2KFK3DJ2G2
 */
package src.inflearn.string;

import java.io.*;

public class String11 {

    public String solution(String str) throws IOException {
        String answer = str.charAt(0) +"";

        char c = str.charAt(0);
        int n=0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==c) {
                n++;
                if(i==str.length()-1) answer += n;
            }else{
                if(n>1) answer +=String.valueOf(n);
                n=1;
                c=str.charAt(i);
                answer += c;
            }
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        String11 m = new String11();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(m.solution(str));
    }
}
