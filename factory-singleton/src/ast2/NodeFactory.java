package ast2;

public class NodeFactory 
{
	public Assignment makeAssignment(Variable v, Expression e)
	{
		return new Assignment(v,e);
	}
	public Decleration makeDecleration(Variable v)
	{
		return new Decleration(v);
	}
	public InfixExpression makeInfixExpression(Operator o, Expression e1, Expression e2)
	{
		return new InfixExpression(o,e1,e2);
	}
	public NumberExpression makeNumberExpression(int n)
	{
		return new NumberExpression(n);
	}
	public Operator makeOperator(String s)
	{
		return new Operator(s);
	}
	public PrefixExpression makePrefixExpression(Operator o, Expression e1, Expression e2)
	{
		return new PrefixExpression(o,e1,e2);
	}
	public Sequence makeSequence(Statement... args)
	{
		return new Sequence(args);
	}
	public StringExpression makeStringExpression(String s)
	{
		return new StringExpression(s);
	}
	public Variable makeVariable(String s)
	{
		return new Variable(s);
	}
	public VariableExpression makeVariableExpression(Variable v)
	{
		return new VariableExpression(v);
	}

}
