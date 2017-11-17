package tests2;

import static org.junit.Assert.*;

import org.junit.Test;

import ast2.*;

public class AST2Tests {

	@Test
	public void test2() {
		
		NodeFactory factory = new NodeFactory();
		
		Variable x = factory.makeVariable("x");
		Expression one = factory.makeNumberExpression(1);
		Expression two = factory.makeNumberExpression(2);
		Operator plus = factory.makeOperator("+");
		Expression exp = factory.makeInfixExpression(plus, one, two);
		Statement decl = factory.makeDecleration(x);
		Statement assign = factory.makeAssignment(x, exp);
		Statement seq = factory.makeSequence(decl, assign);
		assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
		
		// Testing out how abstract factory can be use to create specialized nodes
		ScientificNodeFactory factory2 = new ScientificNodeFactory();
		
		Variable y = factory2.makeVariable("y");
		Expression point_five = factory2.makeFloatNumberExpression((float)0.5); // New Node
		Expression exp2 = factory2.makeInfixExpression(plus, two, point_five);
		Statement decl2 = factory2.makeDecleration(y);
		Statement assign2 = factory2.makeAssignment(y, exp2);
		Statement seq2 = factory2.makeSequence(decl2, assign2); // Modified Node
		assertEquals(seq2.textualRepresentation(), "var y;\ny = 2+0.5");
		
		
		
		
	}

}
