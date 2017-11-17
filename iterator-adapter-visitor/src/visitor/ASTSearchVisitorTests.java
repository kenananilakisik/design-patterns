package question3c;

import static org.junit.Assert.*;

import org.junit.Test;



public class ASTSearchVisitorTests {

	@Test
	public void test1() {
		Variable x = new Variable("x");
	    Expression one = new NumberExpression(1);
	    Expression two = new NumberExpression(2);
	    Expression four = new NumberExpression(4);
	    Operator plus = new Operator("+");
	    Expression exp = new InfixExpression(plus, one, two);
	    Expression exp2 = new PrefixExpression(plus, four);
	    Statement decl = new Declaration(x);
	    Statement assign = new Assignment(x, exp);
	    Statement assign2 = new Assignment(x,exp2);
	    ASTSearchVisitor visitorX = new ASTSearchVisitor("x");
	    ASTSearchVisitor visitorY = new ASTSearchVisitor("y");
	    visitorX.acceptVisit();
	    visitorY.acceptVisit();
	    assertEquals(visitorX.getSet().toString(),"Node Set = {var x,x = 1+2,x = +4}");
	    assertEquals(visitorY.getSet().toString(),"Node Set = {}");
	}
}
