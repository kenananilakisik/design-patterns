package question2b;

/**
 * Represents an expression operator such as + or -.
 */
public class Operator {
   public Operator(String op){
     this.op = op;
   }
   
   public String getOperator(){
     return op;
   }
   
   private String op;
}