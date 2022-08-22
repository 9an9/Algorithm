/*
 * 5. 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * 예시 입력 1
 * a#b!GE*T@S
 * 예시 출력 1
 * S#T!EG*b@a
 */
package src.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class String5 {

    public String solution(String str){
        String answer = "";

        List<Character> strs = new ArrayList<>();
        for(int i=0; i<str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                strs.add(str.charAt(i));
            }
        }

        char[] answer1 = new char[str.length()];
        for(int i=0; i<str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))) {
                answer1[i] = str.charAt(i);
            }
        }
        int x = strs.size()-1;
        for(int i=0; i<str.length(); i++) {
            if(answer1[i] == 0) {
                answer1[i] = strs.get(x);
                x--;
            }
        }
        answer = String.valueOf(answer1);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String5 m = new String5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(m.solution(str));
    }
}
