package ast2;

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
	public Statement[] getArgs()
	{
		return sArray;
	}
	public String getSeq()
	{
		return seq;
	}
	private Statement[] sArray;
	private String seq = "";
	private String out = "";

}
