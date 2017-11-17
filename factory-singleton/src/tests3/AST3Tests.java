package tests3;

import static org.junit.Assert.*;

import org.junit.Test;

import ast3.*;

public class AST3Tests {

	@Test
	public void test3() 
	{
		NodeFactory factory = new NodeFactory();
		
		Variable x = factory.makeVariable("x");
		Variable y = factory.makeVariable("y");
		Variable z = factory.makeVariable("z");
		Expression str = factory.makeStringExpression("1+2");
		Expression one = factory.makeNumberExpression(1);
		Expression two = factory.makeNumberExpression(2);
		Expression four = factory.makeNumberExpression(4);
		Operator plus = factory.makeOperator("+");
		Expression exp = factory.makeInfixExpression(plus, one, two);
		Statement decl = factory.makeDecleration(x);
		Statement decl2 = factory.makeDecleration(z);
		Statement assign = factory.makeAssignment(x, exp);
		Statement assign2 = factory.makeAssignment(z, four);
		Statement seq = factory.makeSequence(decl, assign, decl2, assign2);
		assertEquals(seq.textualRepresentation(), "var x; x = 1+2; var z; z = 4");
		factory.report();
	}

}
