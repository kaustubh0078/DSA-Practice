package Lecture37;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    Scanner sc = new Scanner(System.in);
    private Node root;

    public BinaryTree(){
        this.root = createTree();
    }

    private Node createTree(){
        int n = sc.nextInt();
        Node nn = new Node(n);

//      System.out.println("Has Left Child: ");
        boolean hlc = sc.nextBoolean();
        if (hlc){
            nn.left = createTree();
        }

//      System.out.println("Has Right Child: ");
        boolean hrc = sc.nextBoolean();
        if (hrc){
            nn.right = createTree();
        }

        return nn;
    }

    public void Display(){
        display(root);
    }
    private void display(Node n){
        if (n==null){
            return;
        }
        String s = " "+n.val;
        if (n.left!=null){
            s = n.left.val + " <==" + s;
        }
        else {
            s =  ". <==" + s;
        }

        if (n.right!=null){
            s = s + " ==> " + n.right.val;
        }
        else {
            s =  s + " ==> .";
        }
        System.out.println(s);
        display(n.left);
        display(n.right);
    }

    public int Max(){
        return max(root);
    }

    private int max(Node temp){
        if (temp == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(temp.left);
        int rmax = max(temp.right);

        return Math.max(temp.val, Math.max(lmax,rmax));
    }

    public int Min(){
        return min(root);
    }

    private int min(Node temp){
        if (temp == null){
            return Integer.MAX_VALUE;
        }
        int lmin = max(temp.left);
        int rmin = max(temp.right);

        return Math.min(temp.val, Math.min(lmin,rmin));
    }

    public boolean Find(int item){
        return find(root, item);
    }

    private boolean find(Node temp, int item){
        if (temp == null){
            return false;
        }
        if (temp.val == item){
            return true;
        }

        boolean left = find(temp.left, item);
        boolean right = find(temp.right, item);

        return left || right;
    }

    public int Height(){
        return height(root);
    }
    private int height(Node temp){
        if (temp == null){
            return -1;
        }
        int lh = height(temp.left);
        int rh = height(temp.right);

        return Math.max(lh,rh)+1;
    }

    public void PreOrder(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node temp){
        if (temp == null){
            return;
        }
        System.out.print(temp.val + " ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public void InOrder(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node temp){
        if (temp == null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.val + " ");
        inOrder(temp.right);
    }

    public void PostOrder(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node temp){
        if (temp == null){
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.val + " ");
    }

    public void LevelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);  // Enqueue

        while (!q.isEmpty()){
            Node temp = q.poll();  // Dequeue
            System.out.print(temp.val+" ");
            if (temp.left!=null){
                q.offer(temp.left);
            }
            if (temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
}
