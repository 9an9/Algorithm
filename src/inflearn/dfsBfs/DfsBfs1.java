// 재귀함수(스택프레임)
package src.inflearn.dfsBfs;

public class DfsBfs1 {
    public void DFS(int n) {
        if(n==0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        DfsBfs1 m = new DfsBfs1();
        m.DFS(3);
    }

}
