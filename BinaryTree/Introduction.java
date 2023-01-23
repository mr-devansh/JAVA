package BinaryTree;

import java.util.*;

public class Introduction {
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

    static class Binary {

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

        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int ld = diameter(root.left);
            int lh = height(root.left);

            int rd = diameter(root.right);
            int rh = height(root.right);

            int selfDia = lh + rh + 1;

            return Math.max(ld, Math.max(rd, selfDia));
        }

        public int sum(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = sum(root.left);
            int rh = sum(root.right);
            return lh + rh + root.data;
        }

        public int count(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = count(root.left);
            int rh = count(root.right);
            return lh + rh + 1;
        }

        public int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        public void levelOrder(Node root) {
            // BFS using FIFO of Queue
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node cur = q.remove();
                if (cur == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(cur.data + " ");
                    if (cur.left != null) {
                        q.add(cur.left);
                    }
                    if (cur.right != null) {
                        q.add(cur.right);
                    }
                }
            }
        }

        public void preorder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(Node root) {
            if (root == null) {
                System.out.print("-1" + " ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public void postorder(Node root) {
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.data + " ");
        }

        public boolean isIdentical(Node node, Node subroot) {

            if (node == null && subroot == null) {
                return true;
            } else if (node == null || subroot == null || node.data != subroot.data) {
                return false;
            }

            if (!isIdentical(node.left, subroot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subroot.right)) {
                return false;
            }
            return true;
        }

        public boolean subtree(Node root, Node subroot) {
            if (root == null) {
                return false;
            }
            if (root.data == subroot.data) {
                if (isIdentical(root, subroot)) {
                    return true;
                }
            }
            return subtree(root.left, subroot) || subtree(root.right, subroot);
        }

        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            // three types: linked hashmap, simple hashmap and treemap
            // functions are create, put, get
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> h = new HashMap<>();
            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }
                else{
                    if (!h.containsKey(curr.hd)) {
                        h.put(curr.hd, curr.node);
                    }
                    if (curr.node.left!=null) {
                        q.add(new Info(curr.node.left, curr.hd-1));
                        min = Math.min(min, curr.hd-1);
                    }
                    if (curr.node.right!=null) {
                        q.add(new Info(curr.node.right, curr.hd+1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }
            for (int i = min; i < max+1; i++) {
                System.out.print(h.get(i).data+" ");
            }
            System.out.println();
        }
    
        public void KLevel(Node root, int level, int k) {
            if (root==null) {
                return;
            }
            if (level==k) {
                System.out.print(root.data+" ");
                return;
            }
            else{
                KLevel(root.left, level+1, k);
                KLevel(root.right, level+1, k);
            }
        }
    
        public boolean getpath(Node root, int n, ArrayList<Node> a) {
            if (root==null) {
                return false;
            }
            a.add(root);
            if (root.data==n) {
                return true;
            }
            boolean l = getpath(root.left, n, a);
            boolean r = getpath(root.right, n, a);
            if (l||r) {
                return true;
            }
            a.remove(a.size()-1);
            return false;
        }

        public void LowestCommonAncestor(Node root, int i, int j) {
            ArrayList<Node> a1 = new ArrayList<>();            
            ArrayList<Node> a2 = new ArrayList<>();            

            getpath(root, i, a1);
            getpath(root, j, a2);

            int idx = 0;
            for (; idx < a1.size() && idx<a2.size(); idx++) {
                if (a1.get(idx)!=a2.get(idx)) {
                    break;
                }
            }
            Node lca = a1.get(idx-1);
            System.out.println(lca.data);
        }
    
        public Node LowestCommonAncestor2(Node root, int i, int j) {
            if (root==null || root.data==i || root.data==j) {
                return root;
            }
            Node l = LowestCommonAncestor2(root.left, i, j);
            Node r = LowestCommonAncestor2(root.right, i, j);

            if (r==null) {
                return l;
            }
            if(l==null){
                return r;
            }
            return root;
        }
    
        public int LCAdistance(Node root, int n) {
            if (root==null) {
                return -1;
            }
            if (root.data==n) {
                return 0;
            }
            int l = LCAdistance(root.left, n);
            int r = LCAdistance(root.right, n);
            if (l==-1 && r==-1) {
                return -1;
            }
            else if (l==-1){
                return r+1;
            }
            else{
                return l+1;
            }
        }

        public int minDistance(Node root, int n1, int n2) {
            Node lca = LowestCommonAncestor2(root, n1, n2);
            int d1 = LCAdistance(lca, n1);
            int d2 = LCAdistance(lca, n2);
            return d1+d2;
        }
    
        public int KthAncestor(Node root, int n, int k) {
            if (root==null) {
                return -1;
            }
            if (root.data==n) {
                return 0;
            }
            int l = KthAncestor(root.left, n, k);
            int r = KthAncestor(root.right, n, k);

            if (l==-1 && r==-1) {
                return -1;
            }
            int max = Math.max(l, r);
            if (max+1 == k) {
                System.out.println(root.data);
            }
            return max+1;
        }

        public int SumTree(Node root) {
            if (root==null) {
                return 0;
            }
            
            int l = SumTree(root.left); 
            int r = SumTree(root.right); 

            int data = root.data;

            int left = root.left == null?0: root.left.data+l;
            int right = root.right == null?0: root.right.data+r;

            root.data = left+right;
            return data;
        }
    }

    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1 };
        // Binary tree = new Binary();
        // Node root = tree.build(nodes);
        // tree.preorder(root);
        // System.out.println();
        // tree.inorder(root);
        // System.out.println();
        // tree.postorder(root);
        // System.out.println();
        // tree.levelOrder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.count(root));
        // System.out.println(tree.sum(root));
        // System.out.println(tree.diameter(root));
        // System.out.println(tree.subtree(root, subroot));
        // tree.topView(root);
        // tree.KLevel(root, 0, 2);        
        // tree.LowestCommonAncestor(root, 4, 5);
        // System.out.println(tree.LowestCommonAncestor2(root, 4, 5).data); 
        // System.out.println(tree.minDistance(root, 4,6));
        // System.out.println(tree.KthAncestor(root, 7, 1));

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Binary tree = new Binary();

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);
        tree.SumTree(root);
        tree.preorder(root);
    }
}

// preorder traversal
// root left right