package com.jabbslad.binarytree.traverse;

import com.jabbslad.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public static <T> List<List<T>> traverseIterative(TreeNode<T> root) {
        List<List<T>> result = new LinkedList<>();

        if (root == null)
            return result;

        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<T> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode<T> curr = queue.poll();
                level.add(curr.val);

                if (curr.left != null)
                    queue.add(curr.left);

                if (curr.right != null)
                    queue.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }
}
