package ast3;

public class NodeFactory 
{
	public Assignment makeAssignment(Variable v, Expression e)
	{
		assignment++;
		return new Assignment(v,e);
	}
	public Decleration makeDecleration(Variable v)
	{
		decleration++;
		return new Decleration(v);
	}
	public InfixExpression makeInfixExpression(Operator o, Expression e1, Expression e2)
	{
		infix++;
		return new InfixExpression(o,e1,e2);
	}
	public NumberExpression makeNumberExpression(int n)
	{
		number++;
		return new NumberExpression(n);
	}
	public Operator makeOperator(String s)
	{
		operator++;
		return new Operator(s);
	}
	public PrefixExpression makePrefixExpression(Operator o, Expression e1, Expression e2)
	{
		prefix++;
		return new PrefixExpression(o,e1,e2);
	}
	public Sequence makeSequence(Statement... args)
	{
		sequence++;
		return new Sequence(args);
	}
	public StringExpression makeStringExpression(String s)
	{
		string++;
		return new StringExpression(s);
	}
	public Variable makeVariable(String s)
	{
		variable++;
		return new Variable(s);
	}
	public VariableExpression makeVariableExpression(Variable v)
	{
		varexp++;
		return new VariableExpression(v);
	}
	public void report()
	{
		System.out.print("-------Number of instances of each Type of Node-------\n" +
				"Assignment: " + assignment + 
				"\nDecleration: " + decleration + 
				"\nInfixExpression: " + infix + 
				"\nNumberExpression: " + number +
				"\nOperator: " + operator +
				"\nPrefixExpression: " + prefix + 
				"\nSequence: " + sequence +
				"\nStringExpression: " + string +
				"\nVariable: " + variable +
				"\nVariableExpression: " + varexp);
	}
	private static int assignment,decleration,infix,number,operator,prefix,sequence,string,variable,varexp;
}
