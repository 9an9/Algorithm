package src.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String2 {

    public String solution(String str){
        String answer = "";

        for(char a : str.toCharArray()) {
            if(Character.isLowerCase(a)) {
                answer += Character.toUpperCase(a);
            }else {
                answer += Character.toLowerCase(a);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        String2 m = new String2();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        System.out.print(m.solution(str));

        return ;
    }
}