package tests;
import ast.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class ASTTests {

	@Test
	public void test1() 
	{
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus, one, two);
		Statement decl = new Decleration(x);
		Statement assign = new Assignment(x, exp);
		Statement seq = new Sequence(decl, assign);
		assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
		
		
		Variable y = new Variable("y");
		Expression four = new NumberExpression(4);
		Operator multiply = new Operator("*");
		Expression exp2 = new InfixExpression(multiply,exp,four);
		Statement decl2 = new Decleration(y);
		Statement assign2 = new Assignment(y,exp2);
		Statement seq2 = new Sequence(seq,decl2,assign2);
		assertEquals(seq2.textualRepresentation(), "var x; x = 1+2; var y; y = 1+2*4");
		
		Variable z = new Variable("z");
		Variable q = new Variable("q");
		Expression zero = new NumberExpression(0);
		Operator divide = new Operator("/");
		Expression exp3 = new PrefixExpression(divide,zero,z);
		
		Statement decl3 = new Decleration(z);
		Statement decl4 = new Decleration(q);
		
		Statement assign3 = new Assignment(z,zero);
		Statement assign4 = new Assignment(q,exp3);
		Statement seq3 = new Sequence(seq2,decl3,assign3,decl4,assign4);
		assertEquals(seq3.textualRepresentation(), "var x; x = 1+2; var y; y = 1+2*4; var z; z = 0; var q; q = /0z");
		
		Expression str = new StringExpression("1+2");
		
		assertEquals(exp.textualRepresentation(), str.textualRepresentation());
		
	}

}
