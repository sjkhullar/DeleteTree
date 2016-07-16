package org.learn.Question;

public class DeleteTree {
	public static Node deleteTree(Node root) {
		if(null == root) {
			return null;
		}
		root.left  =  deleteTree(root.left);
		root.right =  deleteTree(root.right);
		root = null;
		return root;
	}
}
