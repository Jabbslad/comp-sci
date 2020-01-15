package com.jabbslad.binarytree.traverse;

import com.jabbslad.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreOrder {
    public static <T> List<T> traverseIterative(TreeNode<T> root) {
        List<T> result = new LinkedList<>();
        if (root == null)
            return result;

        Deque<TreeNode<T>> stack = new LinkedList<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> curr = stack.pop();
            result.add(curr.val);

            if (curr.right != null)
                stack.push(curr.right);

            if (curr.left != null)
                stack.push(curr.left);
        }
        return result;
    }
}
