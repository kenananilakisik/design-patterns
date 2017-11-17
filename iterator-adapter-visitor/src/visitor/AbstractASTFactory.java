package question3c;

/**
 * Abstract Factory for creating AST nodes
 *
 */
public abstract class AbstractASTFactory {
  
   /**
    * factory method for creating an Assignment node
    */
   public abstract Assignment createAssignment(Variable var, Expression exp);
   
   /**
    * factory method for creating a Declaration node
    */
   public abstract Declaration createDeclaration(Variable var);
   
   /**
    * factory method for creating an InfixExpression node
    */
   public abstract InfixExpression createInfixExpression(Operator operator, Expression leftOperand, Expression rightOperand);
   
   /**
    * factory method for creating a PrefixExpression node
    */
   public abstract PrefixExpression createPrefixExpression(Operator operator, Expression operand);
   
   /**
    * factory method for creating a NumberExpression node
    */
   public abstract NumberExpression createNumberExpression(int num);
   
   /**
    * factory method for creating a StringExpression node
    */
   public abstract StringExpression createStringExpression(String text);
   
   /**
    * factory method for creating a VariableExpression node
    */
   public abstract VariableExpression createVariableExpression(Variable var);

   /**
    * factory method for creating a Sequence node
    */
   public abstract Sequence createSequence(Statement stat1, Statement stat2);
   
   /**
    * factory method for creating a Variable
    */
   public abstract Variable createVariable(String name);
   
   /**
    * factory method for creating an Operator
    */
   public abstract Operator createOperator(String op);
}