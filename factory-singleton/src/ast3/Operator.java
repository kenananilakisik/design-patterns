package ast3;

public class Operator extends Expression 
{
	public Operator(String opType)
	{
		operatorType = opType;
	}
	public String textualRepresentation()
	{
		return operatorType;
	}
	
	private String operatorType;

}
