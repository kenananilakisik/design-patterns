package question2b;
import question1b.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeSetTests {
	
	/**
	 * Note that, although there is no separate test for iterator() method it is being tested
	 * indirectly because toString() uses iterator() to parse Nodes in Node set. 
	 */
	
	@Test
	/**
	 * Test for add method
	 */
	public void test1() {
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus,one,two);
		Statement decl = new Declaration(x);
		Statement assign = new Assignment(x,exp);
		Statement seq = new Sequence(decl, assign);
		NodeSet set1 = new NodeSet();
		NodeSet set2 = new NodeSet();
		set1.add(Node.getNode(one.getId()));
		set1.add(Node.getNode(two.getId()));
		set1.add(Node.getNode(exp.getId()));
		set2.add(Node.getNode(decl.getId()));
		set2.add(Node.getNode(assign.getId()));
		set2.add(Node.getNode(seq.getId()));
		assertEquals(set1.toString(),"Node Set = {1,2,1+2}");
		assertEquals(set2.toString(),"Node Set = {var x,x = 1+2,var x; x = 1+2}");
		Node.clear();
	}
	
	@Test
	/**
	 * Test for addAll method
	 */
	public void test2()
	{
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus,one,two);
		Statement decl = new Declaration(x);
		Statement assign = new Assignment(x,exp);
		Statement seq = new Sequence(decl, assign);
		NodeSet set1 = new NodeSet();
		NodeSet set2 = new NodeSet();
		set1.add(Node.getNode(one.getId()));
		set1.add(Node.getNode(two.getId()));
		set1.add(Node.getNode(exp.getId()));
		set2.add(Node.getNode(decl.getId()));
		set2.add(Node.getNode(assign.getId()));
		set2.add(Node.getNode(seq.getId()));
		set1.addAll(set2);
		assertEquals(set1.toString(),"Node Set = {1,2,1+2,var x,x = 1+2,var x; x = 1+2}");
		Node.clear();
	}
	
	@Test
	/**
	 * Test for remove
	 */
	public void test3()
	{
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus,one,two);
		NodeSet set1 = new NodeSet();
		set1.add(Node.getNode(one.getId()));
		set1.add(Node.getNode(two.getId()));
		set1.add(Node.getNode(exp.getId()));
		set1.remove(Node.getNode(two.getId()));
		assertEquals(set1.toString(),"Node Set = {1,1+2}");
		Node.clear();
		
	}
	
	@Test
	/**
	 * Test for contains method
	 */
	public void test4()
	{
		Variable x = new Variable("x");
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus,one,two);
		Statement decl = new Declaration(x);
		NodeSet set1 = new NodeSet();
		set1.add(Node.getNode(one.getId()));
		set1.add(Node.getNode(two.getId()));
		set1.add(Node.getNode(exp.getId()));
		assertEquals(set1.contains(Node.getNode(one.getId())),true);
		assertEquals(set1.contains(Node.getNode(decl.getId())),false);
		Node.clear();
	}
	
	@Test
	/**
	 * Test for size method
	 */
	public void test5()
	{
		Expression one = new NumberExpression(1);
		Expression two = new NumberExpression(2);
		Operator plus = new Operator("+");
		Expression exp = new InfixExpression(plus,one,two);
		NodeSet set1 = new NodeSet();
		set1.add(Node.getNode(one.getId()));
		set1.add(Node.getNode(two.getId()));
		set1.add(Node.getNode(exp.getId()));
		assertEquals(set1.size(),3);
		Node.clear();
	}

}
