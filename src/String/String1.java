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

        return ;
    }
}