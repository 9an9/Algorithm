/*
* 1. 문자 찾기
* 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
* 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
* 입력
* 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
* 문자열은 영어 알파벳으로만 구성되어 있습니다.
* 출력
* 첫 줄에 해당 문자의 개수를 출력한다.
* 예시 입력 1
* Computercooler
* c
* 예시 출력 1 : 2
 */

package src.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String1 {

    public int solution(String str, char c){
        int cnt = 0;

        for(char a : str.toCharArray()) {
            if(a == c) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException{
        String1 m = new String1();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine().toUpperCase();
        char c = Character.toUpperCase(bf.readLine().charAt(0));

        System.out.print(m.solution(str, c));

    }
}