package com.TreesExamples;

import java.util.Stack;

/**
 * Created by Rachana Rao on 12/18/2015.
 */
public class TraverseTree {
    Stack<BinaryTree> stack = new Stack<>();
    BinaryTree Root = null;
    public BinaryTree addNodesToTree(){
        Root = new BinaryTree(1);

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

             BinaryTree leftLeftLeftNode = new BinaryTree(8);
             BinaryTree leftleftRightNode = new BinaryTree(9);

             Root.getLeftNode().getLeftNode().setLeftNode(leftLeftLeftNode);
             Root.getLeftNode().getLeftNode().setRightTree(leftleftRightNode);

             BinaryTree leftRightLeftNode = new BinaryTree(10);
             BinaryTree leftRightRightNode = new BinaryTree(11);

             Root.getLeftNode().getRightTree().setLeftNode(leftRightLeftNode);
             Root.getLeftNode().getRightTree().setRightTree(leftRightRightNode);

                BinaryTree rightLeftLeftNode = new BinaryTree(12);
                BinaryTree rightLeftRightNode = new BinaryTree(13);
                BinaryTree rightrRightLeftNode = new BinaryTree(14);
                BinaryTree rightRightRightNode = new BinaryTree(15);

                Root.getRightTree().getLeftNode().setLeftNode(rightLeftLeftNode);
                Root.getRightTree().getLeftNode().setRightTree(rightLeftRightNode);
                Root.getRightTree().getRightTree().setLeftNode(rightrRightLeftNode);
                Root.getRightTree().getRightTree().setRightTree(rightRightRightNode);
/*
                BinaryTree leftLeftLeftLeftNode = new BinaryTree(16);
                BinaryTree leftleftleftRightNode = new BinaryTree(17);
                BinaryTree leftleftRightLeftNode = new BinaryTree(18);
                BinaryTree leftLeftRightRightNode = new BinaryTree(19);
                BinaryTree leftRightleftleftNode = new BinaryTree(20);
                BinaryTree leftRightleftRightNode = new BinaryTree(21);
                BinaryTree leftRightRightLeftNode = new BinaryTree(22);
                BinaryTree leftRightRightRightNode = new BinaryTree(23);

                Root.getLeftNode().getLeftNode().getLeftNode().setLeftNode(leftLeftLeftLeftNode);
                Root.getLeftNode().getLeftNode().getLeftNode().setRightTree(leftleftleftRightNode);
                Root.getLeftNode().getLeftNode().getRightTree().setLeftNode(leftleftRightLeftNode);
                Root.getLeftNode().getLeftNode().getRightTree().setRightTree(leftLeftRightRightNode);
                Root.getLeftNode().getRightTree().getLeftNode().setLeftNode(leftRightleftleftNode);
                Root.getLeftNode().getRightTree().getLeftNode().setRightTree(leftRightleftRightNode);
                Root.getLeftNode().getRightTree().getRightTree().setLeftNode(leftRightRightLeftNode);
                Root.getLeftNode().getRightTree().getRightTree().setRightTree(leftRightRightRightNode);

                BinaryTree rightRightRightRightNode = new BinaryTree(50);
                Root.getRightTree().getRightTree().getRightTree().setRightTree(rightRightRightRightNode);*/
        return Root;
             }

    private void addLeftLeaf(BinaryTree root){
        while (root!=null){
            stack.push(root);
            root = root.getLeftNode();
        }
    }

    public void inOrderTraverse(BinaryTree root){
        addLeftLeaf(root);

        while (!stack.isEmpty()){
            BinaryTree currentNode = stack.pop();
            System.out.print(currentNode.getData() + "\t");

            if(currentNode.getRightTree()!=null){
                addLeftLeaf(currentNode.getRightTree());
            }
        }
    }

    public void inOrder(BinaryTree Root){
        if(Root==null)
            return;
        else {
            inOrder(Root.getLeftNode());
            System.out.print(Root.getData()+"\t");
            inOrder(Root.getRightTree());
            }
    }

}
