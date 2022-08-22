/*
 * 7. 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 * 예시 입력 1
 * gooG
 * 예시 출력 1
 * YES
 */
package src.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String7 {

    public String solution(String str){
        String answer = "";

        StringBuilder sb = new StringBuilder(str).reverse();
        if(sb.compareTo(new StringBuilder(str))==0) {
            answer = "YES";
        }else {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String7 m = new String7();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine().toUpperCase();

        System.out.println(m.solution(str));
    }
}
