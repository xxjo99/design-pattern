package behavioural.interpreter;

import java.util.Stack;

// 간단 계산 예제
public class Client {

    public static void main(String[] args) {
        // Context 객체 생성
        CalculatorContext context = new CalculatorContext("5 + 3 - 2");

        // 문법 해석
        Expression expression = parse(context);

        // 결과 출력
        System.out.println(context.getExpression() + " = " + expression.interpret());
    }

    private static Expression parse(CalculatorContext context) {
        String[] tokens = context.getExpression().split(" ");
        Stack<Expression> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                Expression left = stack.pop();
                Expression right = new Number(Integer.parseInt(tokens[++i]));
                stack.push(new Add(left, right));
            } else if (tokens[i].equals("-")) {
                Expression left = stack.pop();
                Expression right = new Number(Integer.parseInt(tokens[++i]));
                stack.push(new Subtract(left, right));
            } else {
                stack.push(new Number(Integer.parseInt(tokens[i])));
            }
        }

        return stack.pop();
    }
}
