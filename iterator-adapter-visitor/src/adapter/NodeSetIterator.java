package question2b;

import question1b.*;

/**
 * An Iterator for Node Set.
 * Uses BitVector.iterator() except returns Node type objects with nextElement()
 */
public class NodeSetIterator implements Iterator<Node> {
	
	public NodeSetIterator(IBitVector b)
	{
		it = b.iterator();
	}
	
	@Override
	public boolean hasAnotherElement()
	{
		return it.hasAnotherElement();
	}
	
	@Override
	public Node nextElement()
	{
		
		return Node.getNode(it.nextElement());
	}
	private Iterator<Integer> it;

}
