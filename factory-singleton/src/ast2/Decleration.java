package ast2;

public class Decleration extends Statement
{
	public Decleration(Variable var)
	{
		this.var = var;
	}
	public String textualRepresentation()
	{
		return "var " + var.textualRepresentation();
	}
	private Variable var;

}
