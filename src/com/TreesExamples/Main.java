package com.TreesExamples;

public class Main {

    public static void main(String[] args) {
        TraverseTree tree = new TraverseTree();
        BinaryTree Root = tree.addNodesToTree();
        System.out.println("In Order Traversal");
        System.out.println("------------------------------------------------------------");
        tree.inOrderTraverse(Root);
        System.out.println("");
        tree.inOrder(Root);

        System.out.println("\n\nPreOrder Traversal");
        System.out.println("------------------------------------------------------------");
        PreOrder preOrder = new PreOrder();
        preOrder.preOderTraversalWithoutRecursion(Root);
        System.out.println("");
        preOrder.preOrder(Root);

        System.out.println("\n\n Post Order Traversal");
        System.out.println("------------------------------------------------------------");
        PostOrder postOrder = new PostOrder();

        postOrder.postOrder(Root);
        System.out.println("");
        postOrder.postOderTraversalWithoutRecursion(Root);

        System.out.println("");
        System.out.println("\nLevel Order Traversal");
        System.out.println("----------------------------------------------");
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(Root);

        System.out.println("\n\nLevel Order Traversal In Reverse Order");
        LeveLOrderInReverseOrder orderInReverseOrder = new LeveLOrderInReverseOrder();
        orderInReverseOrder.prebinding(Root);
    }
}
