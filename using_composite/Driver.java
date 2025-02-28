package using_composite;

public class Driver {
    public static void main(String[] args) {
        IExpression _7 = new _Number(7);
        IExpression _8 = new _Number(8);
        IExpression _9 = new _Number(9);
        IExpression _10 = new _Number(10);
        IExpression expression1 = new Expression("*", _9, _10);
        IExpression expression2 = new Expression("+", _7, _8);
        IExpression expression3 = new Expression("-", expression1, expression2);
        System.out.println(expression3.evaluate());
    }
}
