package ast;

public class Variable extends Expression
{
	public Variable(String var)
	{
		this.var = var;
	}
	public String textualRepresentation()
	{
		return var;
	}
	private String var;

}
