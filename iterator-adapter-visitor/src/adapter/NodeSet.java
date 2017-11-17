package question2b;
import question1b.*;

/**
 * A class which uses adapter design pattern and defines its methods in terms of BitVector methods.
 */
public class NodeSet implements Set<Node> {
	
	/**
	 * Constructor for NodeSet
	 */
	public NodeSet()
	{
		adaptee = new BitVector();
	}
	
	@Override
	public void add(Node n)
	{
		adaptee.set(n.getId());
	}
	
	@Override
	public void addAll (Set<Node> n)
	{
		Iterator<Node> it = n.iterator();
		while(it.hasAnotherElement())
		{
			this.add(it.nextElement());
		}
	}
	
	@Override
	public void remove(Node n)
	{
		adaptee.clear(n.getId());
	}
	
	@Override
	public boolean contains(Node n)
	{
		return adaptee.get(n.getId());
	}
	
	@Override
	public int size()
	{
		return adaptee.size();
	}
	
	@Override
	public Iterator<Node> iterator()
	{
		return new NodeSetIterator(adaptee);
	}
	
	@Override
	public String toString()
	{
		String result = "";
		String item = "";
		Iterator<Node> it = this.iterator();
		while(it.hasAnotherElement())
		{
			item = it.nextElement().textualRepresentation();
			if(it.hasAnotherElement())
			{
				result += item + ",";
			}
			else
			{
				result += item;
			}
		}
		return "Node Set = {" + result + "}";
	}
	
	private IBitVector adaptee = null;


}
