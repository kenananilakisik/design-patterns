package question3c;

/**
 * Concrete Factory for creating HTML nodes.
 *
 */
public class StandardASTFactory extends AbstractASTFactory {

  /**
   * factory method for creating an Assignment node
   */
  @Override
  public Assignment createAssignment(Variable var, Expression exp) {
    return new Assignment(var, exp);
  }

  /**
   * factory method for creating a Declaration node
   */
  @Override
  public Declaration createDeclaration(Variable var) {
     return new Declaration(var);
  }

  /**
   * factory method for creating an InfixExpression node
   */
  @Override
  public InfixExpression createInfixExpression(Operator operator, Expression leftOperand, Expression rightOperand) {
    return new InfixExpression(operator, leftOperand, rightOperand);
  }

  /**
   * factory method for creating a PrefixExpression node
   */
  @Override
  public PrefixExpression createPrefixExpression(Operator operator, Expression operand) {
    return new PrefixExpression(operator, operand);
  }
  
  /**
   * factory method for creating a NumberExpression node
   */
  @Override
  public NumberExpression createNumberExpression(int num) {
    return new NumberExpression(num);
  }

  /**
   * factory method for creating a StringExpression node
   */
  @Override
  public StringExpression createStringExpression(String text) {
    return new StringExpression(text);
  }

  /**
   * factory method for creating a VariableExpression node
   */
  @Override
  public VariableExpression createVariableExpression(Variable var) {
    return new VariableExpression(var);
  }

  /**
   * factory method for creating a Sequence node
   */
  @Override
  public Sequence createSequence(Statement stat1, Statement stat2) {
    return new Sequence(stat1, stat2);
  }
  
  /**
   * factory method for creating a Variable
   */
  @Override
  public Variable createVariable(String name){
    return new Variable(name);
  }
  
  /**
   * factory method for creating an Operator
   */
  @Override
  public Operator createOperator(String op){
    return new Operator(op);
  }
  
}
