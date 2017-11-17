package ast4;

public class StringExpression extends Expression 
{
	public StringExpression(String str)
	{
		this.str = str;
	}
	public String textualRepresentation()
	{
		return str;
	}
	private String str;

}
