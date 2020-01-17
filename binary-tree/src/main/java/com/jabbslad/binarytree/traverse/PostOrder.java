package com.jabbslad.binarytree.traverse;

import com.jabbslad.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PostOrder {
    public static <T> List<T> traverseIterative(TreeNode<T> root) {
        LinkedList<T> result = new LinkedList<>();

        if (root == null)
            return result;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> curr = queue.poll();
            result.addFirst(curr.val);
            if (curr.left != null)
                queue.add(curr.left);

            if (curr.right != null)
                queue.add(curr.right);
        }

        return result;
    }

    private static <T> void traverseRecursive(List<T> list, TreeNode<T> root) {
        if (root == null)
            return;

        traverseRecursive(list, root.left);
        traverseRecursive(list, root.right);
        list.add(root.val);
    }

    public static <T> List<T> traverseRecursive(TreeNode<T> root) {
        List<T> list = new LinkedList<>();
        traverseRecursive(list, root);
        return list;
    }
}
