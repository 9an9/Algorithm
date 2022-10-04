// 팩토리얼
package src.inflearn.dfsBfs;

public class DfsBfs3 {
    public int DFS(int n) {
        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        DfsBfs3 m = new DfsBfs3();

        System.out.println(m.DFS(5));
    }
}
