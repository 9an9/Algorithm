/*
 * 5. 쇠막대기
 * 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때,
 * 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오.
 * 입력
 * 한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다.
 * 괄호 문자의 개수는 최대 100,000이다.
 * 출력
 * 잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
 * 예시 입력 1
 * ()(((()())(())()))(())
 * 예시 출력 1
 * 17
 * 예시 입력 2
 * (((()(()()))(())()))(()())
 * 예시 출력 2
 * 24
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackQueue5 {

    public int solution(String str) {
        int answer = 0;

        Stack<Character> stk = new Stack<>();
        int i=0;
        while(i<str.length()) {
            if(str.charAt(i) == '(' && str.charAt(i+1) == ')') {
                answer += stk.size();
                i+=2;
            }else if(str.charAt(i) == '(') {
                stk.push(str.charAt(i));
                i++;
            }else if(str.charAt(i) == ')') {
                stk.pop();
                answer++;
                i++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue5 m = new StackQueue5();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        System.out.println(m.solution(str));
    }
}
