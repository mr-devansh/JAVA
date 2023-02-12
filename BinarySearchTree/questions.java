package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class questions {

    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int item) {
        Node temp = new Node();
        temp.data = item;
        temp.left = temp.right = null;
        return temp;
    }

    public static Node inorder(Node root) {
        if (root == null) {
            return null;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        return root;
    }

    static int sum = 0;

    public static int rangeSum(Node root, int L, int R) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.peek();
            q.remove();
            if (curr.data >= L && curr.data <= R) {
                sum += curr.data;
            }
            if (curr.left != null && curr.data > L) {
                q.add(curr.left);
            }
            if (curr.right != null && curr.data < R) {
                q.add(curr.right);
            }
        }
        return sum;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return newNode(data);
        }
        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int min_diff, min_diff_key;

    public static void closestElement(Node root, int n) {
        if (root == null) {
            return;
        }
        if (root.data == n) {
            min_diff_key = n;
            return;
        }
        if (min_diff > Math.abs(root.data - n)) {
            min_diff = Math.abs(root.data - n);
            min_diff_key = root.data;
        }
        if (n < root.data) {
            closestElement(root.left, n);
        } else {
            closestElement(root.right, n);
        }
    }

    static int maxDiff(Node root, int k) {
        min_diff = 999999999;
        min_diff_key = -1;
        closestElement(root, k);
        return min_diff_key;
    }

    

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);
        insert(root, 3);
        insert(root, 7);
        insert(root, 18);

        // int L = 7, R = 15;
        // System.out.println(rangeSum(root, L, R));

        System.out.println(maxDiff(root, 8));
    }
}
