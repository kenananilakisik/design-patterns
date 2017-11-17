package ast3;
//Class Created to test abstract factory design pattern
public class NewLineSequence extends Sequence
{
	public NewLineSequence (Statement... args)
	{
		super(args);
	}
	public String textualRepresentation()
	{
		int count = 0;
		for(Statement arg : super.getArgs())
		{
			if(count != super.getArgs().length - 1)
			{
				seq += arg.textualRepresentation() + ";"+"\n";
			}
			else
				seq += arg.textualRepresentation();
			count++;
		}
		out = seq;
		seq = "";
		return out;
	}
	private String seq = "";
	private String out = "";

}
