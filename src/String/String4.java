/*
 * 4. 단어 뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 * 예시 입력 1
 * 3
 * good
 * Time
 * Big
 * 예시 출력 1
 * doog
 * emiT
 * giB
 */
package src.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class String4 {

    public String solution(String str){
        String answer = "";

        for(int i=str.length()-1; i>=0; i--) {
            char a = str.charAt(i);
            answer += a;
        }

//      answer = new StringBuilder(str).reverse().toString(); 정답 소스

        return answer;
    }

    public static void main(String[] args) throws IOException {
        String4 m = new String4();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<num; i++) {
            bw.write(m.solution(bf.readLine()) + "\n");
        }

        bw.flush();
        bw.close();


    }
}
