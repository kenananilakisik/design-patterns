package question3c;

/**
 * Represents a string literal expression.
 * @author franktip
 *
 */
public class StringExpression extends Expression {
  public StringExpression(String text){
    this.text = text;
  }
  
  @Override
  public void accept(ASTSearchVisitor v)
  {
	  v.visit(this);
  }
  
  @Override
  public String textualRepresentation() { 
    return "\"" + text + "\"";
  }
 
  private String text;
}
