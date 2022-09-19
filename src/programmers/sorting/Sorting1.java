// K번째 수
package src.programmers.sorting;

import java.util.Arrays;

class Sorting1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int j=0; j<commands.length; j++) {
            int[] arr = new int[commands[j][1]-commands[j][0]+1];
            for(int i=0; i<arr.length; i++) {
                arr[i] = array[commands[j][0]+i-1];
            }
            Arrays.sort(arr);
            answer[j] = arr[commands[j][2]-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Sorting1 m = new Sorting1();
        System.out.println(m.solution(array, commands).toString());
    }
}
