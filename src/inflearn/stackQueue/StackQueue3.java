/*
 * 3. 크레인 인형뽑기(카카오)
 * 크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.
 * 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
 * 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
 * 두 번째 줄부터 N*N board 배열이 주어집니다.
 * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 * 0은 빈 칸을 나타냅니다.
 * 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
 * board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
 * 마지막 줄에는 moves 배열이 주어집니다.
 * moves 배열의 크기는 1 이상 1,000 이하입니다.
 * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 * 출력
 * 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
 * 예시 입력 1
 * 5
 * 0 0 0 0 0
 * 0 0 1 0 3
 * 0 2 5 0 1
 * 4 2 4 4 2
 * 3 5 1 3 1
 * 8
 * 1 5 3 5 1 2 1 4
 * 예시 출력 1
 * 4
 */
package src.inflearn.stackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackQueue3 {
    public int solution(int n, Map<Integer, Queue<Integer>> board, int[] moves) throws IOException {
        int answer=0;

        Stack<Integer> stk = new Stack<>();
        for(int i : moves) {
            if(stk.size()>0){
                if(stk.peek()==board.get(i).peek()) {
                    stk.pop();
                    board.get(i).poll();
                    answer +=2;
                    continue;
                }
            }
            if(board.get(i).size()>0) {
                stk.push(board.get(i).poll());
            }

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        StackQueue3 m = new StackQueue3();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Map<Integer, Queue<Integer>> board = new HashMap<>();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=1; j<n+1; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num != 0) {
                    board.putIfAbsent(j, new LinkedList<Integer>() {
                    });
                    board.get(j).offer(num);
                }
            }
        }
        int x = Integer.parseInt(bf.readLine());
        int[] moves = new int[x];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<x; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(m.solution(n,board,moves));
    }
}
