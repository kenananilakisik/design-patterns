package ast2;

public class NumberExpression extends Expression 
{
	public NumberExpression(int num)
	{
		this.num = num;
	}
	public String textualRepresentation()
	{
		return new Integer(num).toString();
	}
	private int num;

}
