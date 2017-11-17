package question2b;

/**
 * Represents a variable expression. 
 */
public class VariableExpression extends Expression {
  public VariableExpression(Variable var){
    this.var = var;
  }
  
  @Override
  public String textualRepresentation() {
    return var.getName();
  }
  
  private Variable var;
}
