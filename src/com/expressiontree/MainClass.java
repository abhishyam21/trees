package com.expressiontree;


/**
 * Created by Rachana Rao on 1/16/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        String postfixExpression = "ABCD*+*E+";
        ExpressionTree expressionTree = new ExpressionTree();
        BinaryTree tree = expressionTree.createExpressionTree(postfixExpression);
        inOrder(tree);

    }

    public static void inOrder(BinaryTree Root){
        if(Root==null)
            return;
        else {
            inOrder(Root.getLeftNode());
            System.out.print(Root.getData()+"\t");
            inOrder(Root.getRightTree());
        }
    }
}
