package question3c;

/**
 * Represents a sequence a statements.
 */
public class Sequence extends Statement {
  public Sequence(Statement stat1, Statement stat2){
    this.stat1 = stat1;
    this.stat2 = stat2;
  }
  
  @Override
  public void accept(ASTSearchVisitor v)
  {
	  v.visit(this);
  }
  
  @Override
  public String textualRepresentation() {
    return stat1.textualRepresentation() + "; " + stat2.textualRepresentation();
  }
  
  private Statement stat1;
  private Statement stat2;
}
