package ast2;

public class VariableExpression extends Expression 
{
	public VariableExpression(Variable var)
	{
		this.var = var;
	}
	public String textualRepresentation()
	{
		return var.textualRepresentation();
	}
	private Variable var;

}
