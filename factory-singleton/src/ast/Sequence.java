package ast;

public class Sequence extends Statement 
{
	public Sequence(Statement... args)
	{
		this.sArray = args;
	}
	public String textualRepresentation()
	{
		int count = 0;
		for(Statement arg : sArray)
		{
			if(count != sArray.length - 1)
			{
				seq += arg.textualRepresentation() + "; ";
			}
			else
				seq += arg.textualRepresentation();
			count++;
		}
		out = seq;
		seq = "";
		return out;
	}
	private Statement[] sArray;
	private String seq = "";
	private String out = "";

}
