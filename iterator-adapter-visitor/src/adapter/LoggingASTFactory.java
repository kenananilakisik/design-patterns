package question2b;

import java.io.PrintStream;

/**
 * Concrete Factory for creating HTML nodes.
 *
 */
public class LoggingASTFactory extends AbstractASTFactory {

  /**
   * Method for retrieving or creating the instance. Also initializes/resets the counters.
   * @return
   */
  public static LoggingASTFactory create(){ 
    if (instance == null){
      instance = new LoggingASTFactory();
    }
    instance.initializeCounters();
    return instance;
  }
  
  // constructor private, so clients cannot call it directly
  private LoggingASTFactory() {  }
  
  // field for storing the unique instance
  private static LoggingASTFactory instance;
  
  /**
   * counters for the various types of nodes
   */
  public void initializeCounters(){ 
    nrAssignments = 0;
    nrDeclarations = 0;
    nrInfixExpressions = 0;
    nrPrefixExpressions = 0;
    nrNumberExpressions = 0;
    nrStringExpressions = 0;
    nrSequences = 0;
    nrVariableExpressions = 0;
    nrVariables = 0;
    nrOperators = 0;
  }
  
  // the counters
  private int nrAssignments;
  private int nrDeclarations;
  private int nrInfixExpressions;
  private int nrPrefixExpressions;
  private int nrNumberExpressions;
  private int nrStringExpressions;
  private int nrVariableExpressions;
  private int nrSequences;
  private int nrVariables;
  private int nrOperators;
  
  
  /**
   * factory method for creating an Assignment node
   */
  @Override
  public Assignment createAssignment(Variable var, Expression exp) {
    nrAssignments++;
    return new Assignment(var, exp);
  }

  /**
   * factory method for creating a Declaration node
   */
  @Override
  public Declaration createDeclaration(Variable var) {
    nrDeclarations++;
     return new Declaration(var);
  }

  /**
   * factory method for creating an InfixExpression node
   */
  @Override
  public InfixExpression createInfixExpression(Operator operator, Expression leftOperand, Expression rightOperand) {
    nrInfixExpressions++;
    return new InfixExpression(operator, leftOperand, rightOperand);
  }

  /**
   * factory method for creating a PrefixExpression node
   */
  @Override
  public PrefixExpression createPrefixExpression(Operator operator, Expression operand) {
    nrPrefixExpressions++;
    return new PrefixExpression(operator, operand);
  }
  
  /**
   * factory method for creating a NumberExpression node
   */
  @Override
  public NumberExpression createNumberExpression(int num) {
    nrNumberExpressions++;
    return new NumberExpression(num);
  }

  /**
   * factory method for creating a StringExpression node
   */
  @Override
  public StringExpression createStringExpression(String text) {
    nrStringExpressions++;
    return new StringExpression(text);
  }

  /**
   * factory method for creating a VariableExpression node
   */
  @Override
  public VariableExpression createVariableExpression(Variable var) {
    nrVariableExpressions++;
    return new VariableExpression(var);
  }

  /**
   * factory method for creating a Sequence node
   */
  @Override
  public Sequence createSequence(Statement stat1, Statement stat2) {
    nrSequences++;
    return new Sequence(stat1, stat2);
  }
  
  /**
   * factory method for creating a Variable
   */
  @Override
  public Variable createVariable(String name){
    nrVariables++;
    return new Variable(name);
  }
  
  /**
   * factory method for creating an Operator
   */
  @Override
  public Operator createOperator(String op){
    nrOperators++;
    return new Operator(op);
  }
  
  /**
   * report statistics
   */
  public void report(PrintStream p){
     p.println("  Assignment:         " + nrAssignments + "\n" +
               "  Declaration:        " + nrDeclarations + "\n" +
               "  InfixExpression:    " + nrInfixExpressions + "\n" +
               "  PrefixExpression:   " + nrPrefixExpressions + "\n" +
               "  NumberExpression:   " + nrNumberExpressions + "\n" +
               "  StringExpression:   " + nrStringExpressions + "\n" +
               "  VariableExpression: " + nrVariableExpressions + "\n" +
               "  Sequence:           " + nrSequences + "\n" +
               "  Variable:           " + nrVariables + "\n" +
               "  Operator:           " + nrOperators);
   }
  
}
