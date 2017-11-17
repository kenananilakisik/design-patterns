package tests4;

import static org.junit.Assert.*;

import org.junit.Test;

import ast4.*;

public class AST4Tests {

	@Test
	public void tes4t() 
	{
		
		NodeFactory factory = NodeFactory.instance();
		
		Variable x = factory.makeVariable("x");
		Expression one = factory.makeNumberExpression(1);
		Expression two = factory.makeNumberExpression(2);
		Operator plus = factory.makeOperator("+");
		Expression exp = factory.makeInfixExpression(plus, one, two);
		Statement decl = factory.makeDecleration(x);
		Statement assign = factory.makeAssignment(x, exp);
		Statement seq = factory.makeSequence(decl, assign);
		assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
		
		NodeFactory factory2 = NodeFactory.instance(); // returns the same instance of factory created above instead of a new one
		assertEquals(factory2, factory);
		
	}

}
