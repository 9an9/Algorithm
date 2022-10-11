// tree 말단 노드까지의 가장 짧은 경로(DFS)
package src.inflearn.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

/*class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}*/

public class DfsBfs9 {
    Node root;
    public int DFS(int L, Node root){
        if(root.lt==null && root.rt==null) return L;
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        DfsBfs9 m = new DfsBfs9();
        m.root = new Node(1);
        m.root.lt = new Node(2);
        m.root.rt = new Node(3);
        m.root.lt.lt = new Node(4);
        m.root.lt.rt = new Node(5);
        System.out.println(m.DFS(0, m.root));
    }
}
