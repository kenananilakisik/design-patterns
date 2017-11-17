package question3c;

import java.util.NoSuchElementException;

/**
 * Root of the AST Node hierarchy.  
 *
 */
public abstract class Node {
	
	
	public Node()
	{
		
		this.id = counter;	//Assigns current counter value to this id
		
		Node[] temp = new Node[counter]; // temporary array used to expand current array
		
		/**
		 * Copy the elements of current Node array and add this Node to the end of the current array
		 */
		for(int i=0;i<nodeArray.length;i++)
		{
			temp[i] = nodeArray[i];
		}
		temp[temp.length-1] = this;
		nodeArray = temp;
		
		counter++;
	}
	
	/**
	 * Accept methods for Node
	 */
	public abstract void accept(ASTSearchVisitor v);

	
	/**
	 * Generate textual representation for subtree rooted at this node. 
	 */
	public abstract String textualRepresentation();
	
	/**
	 * Returns unique identifier for each node
	 */
	public int getId()
	{
		return id;
	}
	
	/**
	 * Reverse mapping from Nodes to their unique identifiers
	 */
	public static Node getNode(int id) throws NoSuchElementException
	{
		Node result = null;
		for(int i = 0; i<nodeArray.length;i++)
		{
			if (nodeArray[i].getId() == id)
			{
				result = nodeArray[i];
			}
		}
		return result;
	}
	
	/**
	 * Resets static variables for nodes to run multiple tests
	 */
	public static void clear()
	{
		Node.counter = 1;
		Node.nodeArray = new Node[0];
	}
	
	public static int counter = 1;
	public static Node[] nodeArray = new Node[0];
	private int id;
}
