package com.mirroroftree;

import com.TreesExamples.BinaryTree;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Rachana Rao on 12/28/2015.
 */
public class MirrorOfTree {


    public BinaryTree preProcess(BinaryTree root) {
        if(root == null)
        return null;
        else {
           // BinaryTree tree = mirrorOfTree(root);
            BinaryTree tree = convertToMirror(root);
            return tree;
        }
    }

    private BinaryTree mirrorOfTree(BinaryTree root) {
        BinaryTree temp;
       if(root != null){
            if(root.getRightTree() != null){
                temp = root.getRightTree();
                if(root.getLeftNode()!=null)
                root.setRightTree(root.getLeftNode());
                else
                root.setRightTree(new BinaryTree(null));
                root.setLeftNode(temp);
            }
            else if(root.getLeftNode() != null){
                temp = root.getLeftNode();
                if(root.getRightTree() != null)
                root.setLeftNode(root.getRightTree());
                else 
                root.setLeftNode(new BinaryTree(null));
                root.setRightTree(temp);
            }
            mirrorOfTree(root.getLeftNode());
            mirrorOfTree(root.getRightTree());
        }
        return root;
    }
    private  BinaryTree convertToMirror(BinaryTree root) {
        BinaryTree temp;
        if (root != null) {
            temp = root.getLeftNode();
            root.setLeftNode(root.getRightTree());
            root.setRightTree(temp);

            convertToMirror(root.getLeftNode());
            convertToMirror(root.getRightTree());
        }
        return root;
    }
}
