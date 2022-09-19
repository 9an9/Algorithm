/*
 * 7. 교육과정 설계
 * 필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 한 줄에 필수과목의 순서가 주어집니다. 모든 과목은 영문 대문자입니다.
 * 두 번 째 줄부터 현수가 짠 수업설계가 주어집니다.(수업설계의 길이는 30이하이다)
 * 출력
 * 첫 줄에 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력합니다.
 * 예시 입력 1
 * CBA
 * CBDAGE
 * 예시 출력 1
 * YES
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueue7 {

    public String solution(String str1, String str2) {
        String answer = "NO";

        Queue<Character> estl = new LinkedList<>();

        for(char i : str1.toCharArray()) {
            estl.add(i);
        }

        for(char i : str2.toCharArray()) {
            if(estl.size()>0) {
                if(i == estl.peek()) {
                    estl.poll();
                }
            }else {
                answer = "YES";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue7 m = new StackQueue7();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str1 = bf.readLine();
        String str2 = bf.readLine();

        System.out.println(m.solution(str1, str2));
    }
}
