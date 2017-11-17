package question2b;

/**
 * Represents an assignment statement  
 */
public class Assignment extends Statement {
  public Assignment(Variable var, Expression exp){
    this.var = var;
    this.exp = exp;
  }
  
  @Override
  public String textualRepresentation(){
    return var.getName() + " = " + exp.textualRepresentation();
  } 
  
  private Variable var;
  private Expression exp;
}
