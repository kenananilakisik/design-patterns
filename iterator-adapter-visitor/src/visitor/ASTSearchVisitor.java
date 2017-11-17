package question3c;


public class ASTSearchVisitor implements ASTVisitor {
	
	public ASTSearchVisitor (String search)
	{
		set = new NodeSet();
		this.search = search;
		
	}
	@Override
	public void visit(Assignment a)
	{
		if(a.textualRepresentation().contains(search))
		{
			set.add(a);
		}
	}
	
	@Override
	public void visit(Declaration d)
	{
		if(d.textualRepresentation().contains(search))
		{
			set.add(d);
		}
	}
	
	@Override
	public void visit(InfixExpression ie) {}

	@Override
	public void visit(PrefixExpression pe){}
	
	@Override
	public void visit(NumberExpression ne){}
	
	@Override
	public void visit (StringExpression se){}
	
	@Override
	public void visit (VariableExpression ve){}
	
	@Override
	public void visit(Sequence s){}
	
	/**
	 * Iterates all the nodes in AST
	 */
	public void acceptVisit()
	{
		for(Node n: Node.nodeArray)
		{
			n.accept(this);
		}
	}
	
	
	public NodeSet getSet()
	{
		return set;
	}

	private NodeSet set;
	private String search;


}
