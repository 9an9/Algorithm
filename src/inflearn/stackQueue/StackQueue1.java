/*
 * 1. 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 입력
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출력
 * 첫 번째 줄에 YES, NO를 출력한다.
 * 예시 입력 1
 * (()(()))(()
 * 예시 출력 1
 * NO
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackQueue1 {
    public String solution(String str) throws IOException {
        String answer="YES";

        int lt=0;
        int rt=0;

        for(char i : str.toCharArray()) {
            if(i=='(') lt++;
            if(i==')'&&lt>0) {
                lt--;
            }else if(i==')'&&lt==0) {
                answer = "NO";
            }
        }
        if(lt!=0) answer = "NO";

        return answer;

        /*String answer="YES";
        Stack<Character> stack=new Stack<>();
        for(char x : str.toCharArray()){
            if(x=='(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;*/
    }

    public static void main(String[] args) throws IOException {
        StackQueue1 m = new StackQueue1();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.println(m.solution(str));
    }
}