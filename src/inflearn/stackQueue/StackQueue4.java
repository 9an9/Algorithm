/*
 * 4. 후위식 연산(postfix)
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * 출력
 * 연산한 결과를 출력합니다.
 * 예시 입력 1
 * 352+*9-
 * 예시 출력 1
 * 12
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackQueue4 {

    public int solution(String str) {
        int answer = 0;

        Stack<Integer> stk = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(String.valueOf(str.charAt(i)).matches("[1-9]")) {
                stk.push(Character.getNumericValue(str.charAt(i)));
            }else {
                if(str.charAt(i) == '+') stk.push( stk.pop() + stk.pop());
                if(str.charAt(i) == '-') stk.push(-stk.pop() + stk.pop());
                if(str.charAt(i) == '*') stk.push(stk.pop() * stk.pop());
                if(str.charAt(i) == '/') stk.push(1/ (stk.pop() / stk.pop()));
            }
        }
        answer = stk.pop();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue4 m = new StackQueue4();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        System.out.println(m.solution(str));
    }

}
