package ast;

public class PrefixExpression extends Expression
{
	public PrefixExpression(Operator opt, Expression e1, Expression e2)
	{
		this.opt = opt;
		this.e1 = e1;
		this.e2 = e2;
	}
	public String textualRepresentation()
	{
		return opt.textualRepresentation() + e1.textualRepresentation() + e2.textualRepresentation();
	}
	private Operator opt;
	private Expression e1;
	private Expression e2;

}
