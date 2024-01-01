package behavioural.interpreter;

// NonTerminalExpression
public class Add implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Add(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }
}
