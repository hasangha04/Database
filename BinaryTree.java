public class BinaryTree
{ //BinaryTree begins
	Node root;

	public BinaryTree ()
	{

	}//end of the constructor

	// Adds a node to the binary tree 
	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} // end of if statement 
		else {// Sets root as the first node
			Node currentNode = root;
			Node parent;
			while (true){
				parent = currentNode;
				// if new node is less than the parent
				if (key < currentNode.key) {
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parent.leftChild = newNode;
						return; // stops method
					}// end of if statement 
				} // end of if statement 
				else { //  Check if  the new node is less than the parent
					currentNode = currentNode.rightChild;
					// If the right child has no children
					if (currentNode == null) {
						parent.rightChild = newNode;
						return; // stops method 
					} // end of if statement
				} // end of else statement 
			} // end of while loop
		} // end of else loop
	} // end of addNode

	// Search through the tree left to right and print out each node 
	public void inOrderTraverseTree(Node currentNode) 
	{
		if (currentNode != null) 
		{
			// Traverse the left node
			inOrderTraverseTree(currentNode.leftChild);
			System.out.println(currentNode);
			// Traverse the right node
			inOrderTraverseTree(currentNode.rightChild);
		} // end of if statement 
	} // end of inOrderTraverseTree

	// Search through the tree top to bottom and print out each node 
	public void preorderTraverseTree(Node currentNode) 
	{
		if (currentNode != null) 
		{
			System.out.println(currentNode);
			preorderTraverseTree(currentNode.leftChild);
			preorderTraverseTree(currentNode.rightChild);
		}// end of if statement 
	} // end of preOrderTraverseTree

	// Search through the tree from the bottom to the top and prints 
	// out each node as it goes along
	public void postOrderTraverseTree(Node currentNode) 
	{
		if (currentNode != null) 
		{
			postOrderTraverseTree(currentNode.leftChild);
			postOrderTraverseTree(currentNode.rightChild);
			System.out.println(currentNode);
		}// end of if statement 
	} // end of postOrderTraverseTree

	// Replaces a name value in the binary tree
	public void replaceNode(int key, String newName) 
	{
		// Start at the top of the tree
		Node currentNode = root;
		
        // searches for key in tree 
		while (currentNode.key != key) 
		{
			// If we should search to the left
			if (key < currentNode.key) 
			{
				// Shift the current Node to the left child
				currentNode = currentNode.leftChild;
			} else{
				// Shift the current Node to the right child
				currentNode = currentNode.rightChild;
			}// end of else statement 
		}// end of if statement 

		currentNode.name = newName;
	}// end of replaceNode
}//BinaryTree ends