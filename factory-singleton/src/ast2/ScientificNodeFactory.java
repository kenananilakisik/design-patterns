package ast2;
// Class Created to test abstract factory design pattern
public class ScientificNodeFactory extends NodeFactory 
{
	
	public FloatNumberExpression makeFloatNumberExpression(float f)
	{
		return new FloatNumberExpression(f);
	}
	public Sequence makeSequence(Statement... args)
	{
		return new NewLineSequence(args);
	}

}
