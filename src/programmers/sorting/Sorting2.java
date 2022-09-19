// 가장 큰 수
package src.programmers.sorting;


import java.util.*;

class Sorting2 {
    public String solution(int[] array) {
        String answer = "";
        String []res =new String[array.length];

        for(int i=0; i<array.length; i++){
            res[i]=String.valueOf(array[i]);

        }
        Arrays.sort(res, (a,b)->{
                    return (a+b).compareTo(b+a);
                }
        );


        for(int i=array.length-1; i>=0; i--){
            answer+=res[i];
        }

        if(answer.charAt(0)=='0') return "0";

        return answer;
    }

    public static void main(String[] args) {
        //int[] array = {6, 10, 2};
        int[] array = {3, 30, 34, 5, 9};

        Sorting2 m = new Sorting2();
        System.out.println(m.solution(array));
    }
}

