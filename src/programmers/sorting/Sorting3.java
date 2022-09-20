//H-index
package src.programmers.sorting;

import java.util.Arrays;

public class Sorting3 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        int i=0;
        int j=0;
        while(j< array.length) {
            if(i<=array[j] && i<= array.length-j) {
                answer = i++;
            }else if (i>array[j]) {
                j++;
            }else break;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {3, 0, 6, 1, 5};

        Sorting3 m = new Sorting3();
        System.out.println(m.solution(array));
    }
}
