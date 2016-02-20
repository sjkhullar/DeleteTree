To delete binary tree, we have to delete all the nodes in the tree. Lets start from very small tree, then we will use this foundation to delete the whole tree. Suppose we have tree of 3 nodes

1.) Parent Node
2.) Child 1
3.) Child 2

--------------------Parent


------------Child 1---------Child2

If we would like to delete this tree we would have to perform following steps.
1.) Go to parent node
2.) Delete left child node
3.) Delete right child Node
4.) Delete Current Node i.e. current parent node.
With, above steps we will able to delete the binary tree. One more thing we can note that, it is nothing but post order traversal i.e. process (or delete) left child, process (or delete) right child, process (or delete) current node.
So, above procedure can be thought of as , given any parent we are able to delete its left child, right child and parent node. we can say that all the nodes get deleted. We can scale about process to delete the whole tree