package com.insertingnewnodetotree;

import com.TreesExamples.BinaryTree;
import com.TreesExamples.LevelOrderTraversal;
import com.TreesExamples.TraverseTree;

/**
 * Created by Rachana Rao on 12/27/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        TraverseTree traverseTree = new TraverseTree();
        BinaryTree root = traverseTree.addNodesToTree();

        System.out.println("Before Inserting");
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(root);
        InsertingNodeToTreeUsingLevelOrderTraversal insertingNodeToTreeUsingLevelOrderTraversal = new InsertingNodeToTreeUsingLevelOrderTraversal();
        root = insertingNodeToTreeUsingLevelOrderTraversal.addNodeToTree(100,root);

        System.out.println("\nAfter Inserting Node");
        levelOrderTraversal.levelOrderTraversal(root);

        root = insertingNodeToTreeUsingLevelOrderTraversal.addNodeToTree(101,root);

        System.out.println("\nAfter Inserting Node");
        levelOrderTraversal.levelOrderTraversal(root);

        root = insertingNodeToTreeUsingLevelOrderTraversal.addNodeToTree(102,root);

        System.out.println("\nAfter Inserting Node");
        levelOrderTraversal.levelOrderTraversal(root);

        System.out.println("\n Inorder traversal");
        traverseTree.inOrder(root);

    }
}
