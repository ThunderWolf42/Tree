public class BinaryTreeApp {
    public static void main (String [] args)
    {
        BinaryTree tree = new BinaryTree();
        TreeNode node;
        node = new TreeNode(3);
        tree.insert(node);
        node = new TreeNode (2);
        tree.insert(node);
        node = new TreeNode(1);
        tree.insert(node);
        node = new TreeNode (6);
        tree.insert(node);
        node = new TreeNode(5);
        tree.insert(node);
        node = new TreeNode (4);
        tree.insert(node);
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inOrder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postOrder :");
        tree.postOrder();
        System.out.println();
    }
}
