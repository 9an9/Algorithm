// 이진수 출력(재귀)
package src.inflearn.dfsBfs;

public class DfsBfs2 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n/2);
            System.out.print(n%2 + " ");
        }
    }

    public static void main(String[] args) {
        DfsBfs2 m = new DfsBfs2();

        m.DFS(11);
    }
}
