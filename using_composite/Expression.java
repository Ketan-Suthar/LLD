package using_composite;

public class Expression implements IExpression {
    private final String operation;
    private final IExpression leftExpression;
    private final IExpression rightExpression;

    public Expression(final String op, final IExpression l, final IExpression r) {
        operation = op;
        leftExpression = l;
        rightExpression = r;
    }

    @Override
    public double evaluate() {
        if(operation.equals("+")) {
            return leftExpression.evaluate() + rightExpression.evaluate();
        }
        if(operation.equals("-")) {
            return leftExpression.evaluate() - rightExpression.evaluate();
        }
        if(operation.equals("*")) {
            return leftExpression.evaluate() * rightExpression.evaluate();
        }
        if(operation.equals("/")) {
            return leftExpression.evaluate() / rightExpression.evaluate();
        }
        return 0;
    }
}
