package ast4;

public class Assignment extends Statement 
{
	public Assignment(Variable var, Expression exp)
	{
		this.var = var;
		this.exp = exp;
	}
	public String textualRepresentation()
	{
		return var.textualRepresentation() + " = " + exp.textualRepresentation(); 
	}
	private Variable var;
	private Expression exp;

}
