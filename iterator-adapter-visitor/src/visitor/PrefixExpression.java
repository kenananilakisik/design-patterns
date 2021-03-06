package question3c;

/**
 * Represents a unary prefix expression. 
 */
public class PrefixExpression extends Expression {

  public PrefixExpression(Operator operator, Expression operand){
    this.operator = operator;
    this.operand = operand;
  }
  
  @Override
  public void accept(ASTSearchVisitor v)
  {
	  v.visit(this);
  }
  
  @Override
  public String textualRepresentation() {
   return operator.getOperator() + operand.textualRepresentation();
  }

  private Operator operator;
  private Expression operand;
}