package question2b;

/**
 * Represents an binary infix expression. 
 */
public class InfixExpression extends Expression {

  public InfixExpression(Operator operator, Expression leftOperand, Expression rightOperand){
    this.operator = operator;
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }
  
  @Override
  public String textualRepresentation() {
   return leftOperand.textualRepresentation() + operator.getOperator() + rightOperand.textualRepresentation();
  }

  private Operator operator;
  private Expression leftOperand;
  private Expression rightOperand;
}
