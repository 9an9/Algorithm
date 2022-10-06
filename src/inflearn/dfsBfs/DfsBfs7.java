// 이진트리 순회(넓이우선탐색 : 레벨탐색) BFS
package src.inflearn.dfsBfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DfsBfs7 {
    Node root;
    public void DFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " ");
            for(int i=0; i<len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DfsBfs7 m = new DfsBfs7();
        m.root = new Node(1);
        m.root.lt = new Node(2);
        m.root.rt = new Node(3);
        m.root.lt.lt = new Node(4);
        m.root.lt.rt = new Node(5);
        m.root.rt.lt = new Node(6);
        m.root.rt.rt = new Node(7);
        m.DFS(m.root);
    }
}
