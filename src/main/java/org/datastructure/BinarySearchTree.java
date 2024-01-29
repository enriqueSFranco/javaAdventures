package org.datastructure;

public class BinarySearchTree {
    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode() {}

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }

    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    private TreeNode insertNode(TreeNode node, int data) {
        if (node == null) {
            node = new TreeNode(data);
            return node;
        }
        if (node.getData() < data)
            node.setLeft(insertNode(node.getLeft(), data));
        else
            node.setRight(insertNode(node.getRight(), data));
        return node;
    }

    public void insert(int data) {
        this.root = insertNode(this.root, data);
    }

    private void helperInorder(TreeNode root) {
        if (root != null) {
            helperInorder(root.getLeft());
            System.out.print(root.getData() + " ");
            helperInorder(root.getRight());
        }
    }

    public void inorder() {
        this.helperInorder(this.root);
    }

    // ejercicio de leetcode
    private boolean dfs(TreeNode node, int currSum, int targetSum) {
        if (node == null) return false;

        currSum += node.getData();
        if (node.getLeft() != null && node.getRight() != null) return currSum == targetSum;

        return (dfs(node.getLeft(), currSum, targetSum) || dfs(node.getRight(), currSum, targetSum));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return this.dfs(root, 0, targetSum);
    }
}
