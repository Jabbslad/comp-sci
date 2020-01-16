package com.jabbslad.binarytree.traverse;

import com.jabbslad.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InOrder {
    public static <T> List<T> traverseIterative(TreeNode<T> root) {
        List<T> result = new LinkedList<>();
        TreeNode<T> curr = root;

        Deque<TreeNode<T>> stack = new LinkedList<>();

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }
}
