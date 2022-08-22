/*
 * 3. 가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 * 예시 입력 1
 * 5
 * 2 3 3 1 3
 * 1 1 2 2 3
 * 예시 출력 1
 * A
 * B
 * A
 * B
 * D
 */
package src.array;

import java.io.*;

public class Array3 {
    public void solution(int n, String str1, String str2) throws IOException {
        String answer = "";

        String[] a = str1.split(" ");
        String[] b = str2.split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<n; i++) {
            int na = Integer.parseInt(a[i]);
            int nb = Integer.parseInt(b[i]);
            if(Math.abs(na-nb)==1) {
                if(na>nb) {
                    bw.write("A\n");
                }else bw.write("B\n");
            }else if(Math.abs(na-nb)==2) {
                if(na<nb) {
                    bw.write("A\n");
                }else bw.write("B\n");
            }else bw.write("D\n");
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        Array3 m = new Array3();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();

        m.solution(n,str1,str2);
    }
}
