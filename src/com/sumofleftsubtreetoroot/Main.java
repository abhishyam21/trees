package com.sumofleftsubtreetoroot;

import com.TreesExamples.BinaryTree;
import com.TreesExamples.LevelOrderTraversal;

/**
 * Created by Rachana Rao on 1/15/2016.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        BinaryTree root = main.addNodesToTree();

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.levelOrderTraversal(root);

        System.out.println("\n------------------------------\n");
        ChangeTree changeTree = new ChangeTree();

        BinaryTree root1 = changeTree.ChangeTreeData(root);
        levelOrderTraversal.levelOrderTraversal(root1);


    }


    public BinaryTree addNodesToTree(){
        BinaryTree Root = new BinaryTree(1);

        BinaryTree leftNode = new BinaryTree(2);

        Root.setLeftNode(leftNode);

        BinaryTree rightNode = new BinaryTree(3);
        Root.setRightTree(rightNode);

        BinaryTree leftleftNode = new BinaryTree(4);
        Root.getLeftNode().setLeftNode(leftleftNode);

        BinaryTree leftRightTree = new BinaryTree(5);
        Root.getLeftNode().setRightTree(leftRightTree);


        BinaryTree rightLeftNode = new BinaryTree(6);
        BinaryTree rightRightNode = new BinaryTree(7);

        Root.getRightTree().setLeftNode(rightLeftNode);
        Root.getRightTree().setRightTree(rightRightNode);

        return Root;
    }
}
