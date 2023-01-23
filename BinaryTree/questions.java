package BinaryTree;

import java.util.*;

public class questions {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binary {
        static int idx = -1;

        public Node build(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }

        public void inOrder(Node node) {
            if (node == null)
                return;
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }

        public boolean univalued(Node root) {
            if (root == null) {
                return true;
            }
            if (root.left != null && root.data != root.left.data) {
                return false;
            }
            if (root.right != null && root.data != root.right.data) {
                return false;
            }
            return univalued(root.left) && univalued(root.right);
        }

        public Node invert(Node root) {
            if (root == null) {
                return root;
            }
            Node l = invert(root.left);
            Node r = invert(root.right);
            root.left = r;
            root.right = l;
            return root;
        }

        public Node deleteLeafX(Node root, int X) {
            if (root==null) {
                return null;
            }
            root.left = deleteLeafX(root.left, X);
            root.right = deleteLeafX(root.right, X);
            if (root.data==X && root.left==null && root.right==null) {
                return null;
            }
            return root;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        binary tree = new binary();
        tree.deleteLeafX(root, 4);
        tree.inOrder(root);
    }
}