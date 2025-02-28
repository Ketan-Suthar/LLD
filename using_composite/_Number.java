package using_composite;

public class _Number implements IExpression {
    private final double number;

    public _Number(final double d) {
        number = d;
    }

    @Override
    public double evaluate() {
        return number;
    }
}
