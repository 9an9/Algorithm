/*
 * 3. 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 * 예시 입력 1 : it is time to study
 * 예시 출력 1 : study
 */

package src.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String3 {

    public String solution(String str){
        String[] words = str.split(" ");
        String answer = "";
        int max = 0;
//      int max = Integer.MIN_VALUE; 정답 소스
        for(String a : words) {
            if(a.length()>max) {
               max = a.length();
               answer = a;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        String3 m = new String3();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.print(m.solution(str));

    }
}
