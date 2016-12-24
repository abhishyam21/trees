package com.expressiontree;

import java.util.Stack;

/**
 * Created by Rachana Rao on 1/16/2016.
 */
public class ExpressionTree {

    public BinaryTree createExpressionTree(String postfixExpression) {
        BinaryTree root = null;
        Stack<BinaryTree> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.length(); i++) {
            if(isOperator(postfixExpression.charAt(i))){
                root = new BinaryTree(postfixExpression.charAt(i));
                root.setRightTree(stack.pop());
                root.setLeftNode(stack.pop());
                stack.push(root);
            }else {
                BinaryTree node = new BinaryTree(postfixExpression.charAt(i));
                stack.push(node);
            }
        }
        return root;
    }

    private boolean isOperator(char c){
        if(c == '+' || c =='-' || c== '*' || c=='/' || c=='^')
            return true;
        else
            return false;
    }
}
