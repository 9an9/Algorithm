// 전화번호 목록
package src.programmers.hash;

import java.util.Arrays;
import java.util.Comparator;

public class Hash3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0; i< phone_book.length-1; i++) {
            String x = phone_book[i];
            String y = phone_book[i+1];
            if(x.length()<=y.length()){
                if(!x.equals(y) && y.substring(0,x.length()).equals(x)) return false;
            }
        }





        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"123","4567","789"};

        Hash3 m = new Hash3();
        System.out.println(m.solution(phone_book));
    }
}
