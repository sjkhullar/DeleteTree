package org.learn.Client;

import org.learn.Question.DeleteTree;
import org.learn.Question.Node;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		// root level 0
		Node A = Node.createNode(100);
		// Level 1
		Node B = Node.createNode(50);
		Node C = Node.createNode(150);
		// Level 2
		Node D = Node.createNode(25);
		Node E = Node.createNode(80);
		Node F = Node.createNode(125);
		Node G = Node.createNode(175);
		
		// connect Level 0 and 1
		A.left = B;
		A.right = C;
		// connect level 1 and level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		
    	Node node = DeleteTree.deleteTree(A);
    	if(null == node) {
    		System.out.println("Tree deleted sucessfully");
    	} else {
    		System.out.println("Error: Could not delete tree sucessfully");
    	}
    }
}
