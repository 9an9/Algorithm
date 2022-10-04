// 이진트리순회(DFS : Depth-First Search)
package src.inflearn.dfsBfs;

class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class DfsBfs5 {
    Node root;
    public void DFS(Node root) {
        if(root==null) return;
        else {
            //System.out.print(root.data + " "); //전위
            DFS(root.lt);
            System.out.print(root.data + " "); //중위
            DFS(root.rt);
            //System.out.print(root.data + " "); //후위
        }
    }

    public static void main(String[] args) {
        DfsBfs5 m = new DfsBfs5();
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
