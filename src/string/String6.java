/*
 * 6. 중복문자제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 * 예시 입력 1
 * ksekkset
 * 예시 출력 1
 * kset
 */
package src.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class String6 {

    public String solution(String str){
        String answer = "";
        Set<Character> strset = new HashSet<>();
        for(char item : str.toCharArray()) {
            if(!strset.contains(item)) {
                answer += item;
                strset.add(item);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String6 m = new String6();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(m.solution(str));
    }
}
