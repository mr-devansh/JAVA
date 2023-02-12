package BinarySearchTree;

import java.util.*;

public class introduction {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean search(Node root, int x) {
        if (root==null) {
            return false;
        }
        if (root.data==x) {
            return true;
        }
        if (root.data>x) {
            return search(root.left, x);
        }
        else{
            return search(root.right, x);
        }
    }

    public static Node delete(Node root, int val) {
        if (root.data<val) {
            root.right = delete(root.right, val);
        }
        else if(root.data>val){
            root.left = delete(root.left, val);
        }
        else{
            // case 1 = leaf node
            if (root.left == null && root.right==null) {
                return null;
            }
            // case 2 = single child
            if(root.left==null){
                return root.right;
            }
            else if (root.right==null) {
                return root.left;
            }
            // case 3 = both children
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    private static Node findInOrderSuccessor(Node root) {
        while (root.left!=null) {
            root = root.left;
        }
        return root;
    }

    public static void print(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i)+" ");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer> ar) {
        if (root==null) {
            return;
        }
        ar.add(root.data);
        if (root.left==null && root.right==null) {
            print(ar);
        }
        printRoot2Leaf(root.left, ar);
        printRoot2Leaf(root.right, ar);
        ar.remove(ar.size()-1);
    }

    public static void printInRange(Node root, int i, int j) {
        if (root==null) {
            return;
        }
        if (root.data>=i && root.data<=j) {
            printInRange(root.left, i, j);
            System.out.println(root.data);
            printInRange(root.right, i, j);
        }
        else if(root.data < i){
            printInRange(root.left, i, j);
        }
        else{
            printInRange(root.right, i, j);
        }
    }

    public static Node insert(Node root, int val) {
        if (root==null) {
            root = new Node(val); 
            return root;
        }
        if (root.data>val) {
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root==null) {
            return;
        }
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }

    public static void inorder(Node root) {
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> list) {
        if (root==null) {
            return;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static boolean validate(Node root, Node min, Node max) {
        if(root==null){
            return true;
        }
        if (min!=null && root.data<=min.data) {
            return false;
        }
        else if (max!=null && root.data>=max.data) {
            return false;
        }
        return validate(root.left, min, max) &&
                validate(root.right, min, max);
    }

    public static Node mirror(Node root) {
        if (root==null ) {
            return null;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);
        root.left = right;
        root.right = left;     
        return root;   
    }

    public static Node balancedBST(Node root) {
        ArrayList<Integer> ar = new ArrayList<>();
        getInorder(root, ar);
        root = createBST(ar, 0, ar.size()-1);
        return root;
    }

    public static Node createBST(ArrayList<Integer> a , int i, int j) {
        if (i>j) {
            return null;
        }
        int mid = (i+j)/2;
        Node root = new Node(a.get(mid));
        root.left = createBST(a, i, mid-1);
        root.right = createBST(a, mid+1, j);
        return root;
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST, int size, int min, int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

    public static int maxBST = 0;
    public static Info sizeOfLargestBST(Node root) {
        if (root==null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = sizeOfLargestBST(root.left);
        Info right = sizeOfLargestBST(root.right);

        int size = left.size+right.size+1;
        int min = Math.min(root.data, Math.min(left.min, right.min));
        int max = Math.max(root.data, Math.max(left.max, right.max));

        if (root.data<=left.max || root.data>=right.min) {
            return new Info(false, size, min, max);       
        }
        if (left.isBST&&right.isBST) {
            maxBST = Math.max(size, maxBST);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    public static Node merge(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        getInorder(root1, arr1);
        getInorder(root2, arr2);

        int i=0, j=0;
        ArrayList<Integer> arrfinal = new ArrayList<>();

        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i)>=arr2.get(j)) {
                arrfinal.add(arr2.get(j));
                j++;
            }
            else{
                arrfinal.add(arr1.get(i));
                i++;
            }
        }
        while (i<arr1.size()) {
            arrfinal.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            arrfinal.add(arr2.get(j));
            j++;
        }
        System.out.println(arrfinal);
        return sortedArrayToBalancedBST(arrfinal, 0, arrfinal.size()-1);
    }

    public static Node sortedArrayToBalancedBST(ArrayList<Integer> arr, int i, int j) {
        if (i>j) {
            return null;
        }
        int mid = (i+j)/2;
        Node root = new Node(arr.get(mid));
        root.left = sortedArrayToBalancedBST(arr, i, mid-1);
        root.right = sortedArrayToBalancedBST(arr, mid+1, j);
        return root;
    }

    public static Node sortedArrayToBalancedBST(int[] arr, int i, int j) {
        if (i>j) {
            return null;
        }
        int mid = (i+j)/2;
        Node root = new Node(arr[mid]);
        root.left = sortedArrayToBalancedBST(arr, i, mid-1);
        root.right = sortedArrayToBalancedBST(arr, mid+1, j);
        return root;
    }

    public static void main(String[] args) {
        // int values[] = {8,5,3,1,4,6,10,11,14};
        // Node root = null;
        // for (int i = 0; i < values.length; i++) {
        //     root = insert(root, values[i]);
        // }
        // inorder(root);
        // System.out.println(search(root, 7) == true?"found":"not found");
        
        // // root = delete(root, 10);
        // System.out.println();
        // inorder(root);

        // printInRange(root, 5, 10);

        // printRoot2Leaf(root, new ArrayList<>());

        // System.out.println(validate(root, null, null));

        // mirror(root);
        // inorder(root);
        // System.out.println();

        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        // Node root2 = sortedArrayToBalancedBST(arr, 0, 9);
        // inorder(root2);
        // System.out.println();

        // root = balancedBST(root);
        // inorder(root);

        // Info info = sizeOfLargestBST(root);
        // System.out.println(maxBST);

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root_new = merge(root1, root2);

        preorder(root_new);
    }
}

// introduction
// makes searching of element efficient and easy
// with time complexity of O(height), or min logN max N

// properties
// left subtree nodes < root
// right subtree node > root
// left right subtrees are also BST with no duplicates

// traversal 
// Inorder traversal of BStree is a sorted array

