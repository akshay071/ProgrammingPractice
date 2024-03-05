package org.leetcode;

public class BinaryTreeDiameter {
    static int ans = 1;
    public static int diameterOfBinaryTree(Node root) {
        height(root);

        return ans-1;
    }



    private static int height(Node root){
        if(root == null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        ans = Math.max(ans,1+lheight+rheight);

        return Math.max(lheight,rheight)+1;
    }

    public static void main(String[] args)
    {
        TreeNode tree = new TreeNode();

        tree.root1 = new Node(1);
        tree.root1.left = new Node(2);
        tree.root1.right = new Node(3);
        tree.root1.left.left = new Node(4);
        tree.root1.left.right = new Node(5);


        // Function call
            System.out.println("Diameter of tree is: "+diameterOfBinaryTree(tree.root1));

    }
}
