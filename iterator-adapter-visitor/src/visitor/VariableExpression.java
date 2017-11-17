package question3c;

/**
 * Represents a variable expression. 
 */
public class VariableExpression extends Expression {
  public VariableExpression(Variable var){
    this.var = var;
  }
  
  @Override
  public void accept(ASTSearchVisitor v)
  {
	  v.visit(this);
  }
  
  @Override
  public String textualRepresentation() {
    return var.getName();
  }
  
  private Variable var;
}
