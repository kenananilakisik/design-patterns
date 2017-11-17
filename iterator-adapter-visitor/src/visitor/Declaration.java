package question3c;

/**
 * Represents a variable declaration  
 */
public class Declaration extends Statement {
   public Declaration(Variable var){
     this.var = var;
   }
   
   @Override
   public void accept(ASTSearchVisitor v)
   {
 	  v.visit(this);
   }
   
   @Override
   public String textualRepresentation() {
     return "var " + var.getName();
   }
   
   private Variable var;  
}
