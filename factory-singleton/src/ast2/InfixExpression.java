package ast2;

public class InfixExpression extends Expression 
{
	public InfixExpression(Operator opt, Expression e1, Expression e2)
	{
		this.opt = opt;
		this.e1 = e1;
		this.e2 = e2;
	}
	public String textualRepresentation()
	{
		return e1.textualRepresentation() + opt.textualRepresentation() + e2.textualRepresentation();
	}
	
	private Operator opt;
	private Expression e1;
	private Expression e2;
	
}
