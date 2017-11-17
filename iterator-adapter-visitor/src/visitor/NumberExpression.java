package question3c;

/**
 * Represents a numeric expression 
 */
public class NumberExpression extends Expression {
    public NumberExpression(int num){
      this.num = num;
    }
    
    @Override
    public void accept(ASTSearchVisitor v)
    {
  	  v.visit(this);
    }
    
    @Override
    public String textualRepresentation() { 
      return new Integer(num).toString();
    }
   
    private int num;
}
