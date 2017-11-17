package question2b;

/**
 * Represents a numeric expression 
 */
public class NumberExpression extends Expression {
    public NumberExpression(int num){
      this.num = num;
    }
    
    @Override
    public String textualRepresentation() { 
      return new Integer(num).toString();
    }
   
    private int num;
}
