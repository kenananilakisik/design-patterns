package question3c;

public interface ASTVisitor {
	
	/**
	 * Visit method for an Assignment node
	 */
	public void visit(Assignment a);
	
	/**
	 * Visit method for an Declaration node
	 */
	public void visit(Declaration d);
	
	/**
	 * Visit method for an InfixExpression node
	 */
	public void visit(InfixExpression ie);

	/**
	 * Visit method for an PrefixExpression node
	 */
	public void visit(PrefixExpression pe);
	
	/**
	 * Visit method for an NumberExpression node
	 */
	public void visit(NumberExpression ne);
	
	/**
	 * Visit method for an StringExpression node
	 */
	public void visit (StringExpression se);
	
	/**
	 * Visit method for an VariableExpression node
	 */
	public void visit (VariableExpression ve);
	
	/**
	 * Visit method for an Sequence node
	 */
	public void visit(Sequence s);
	
}
