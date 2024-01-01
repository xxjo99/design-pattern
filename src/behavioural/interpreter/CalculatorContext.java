package behavioural.interpreter;

public class CalculatorContext {
    private String expression;

    public CalculatorContext(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
}
