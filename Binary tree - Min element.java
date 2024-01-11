import java.util.*;

class treenode {
    int data;
    treenode left, right;

    public treenode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class binarytree {
    treenode root;

    public binarytree() {
        this.root = null;
    }

    public int min(treenode root) {
        if (root == null)
            return Integer.MAX_VALUE; // Set to the maximum possible value initially

        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }
}

class Main {
    public static void main(String args[]) {
        binarytree tree = new binarytree();

        tree.root = new treenode(1);

        tree.root.left = new treenode(2);
        tree.root.right = new treenode(3);

        tree.root.left.left = new treenode(4);
        tree.root.left.right = new treenode(5);

        System.out.println("The Minimum element: " + tree.min(tree.root));
    }
}
