package behavioural.interpreter;

// NonTerminalExpression
public class Subtract implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Subtract(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
