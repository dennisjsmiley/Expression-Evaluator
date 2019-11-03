package expression.evaluator.operation;

import expression.evaluator.node.Node;

public class LogarithmOperation extends BinaryOperation {
    public LogarithmOperation(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return Math.log(getLeft().evaluate()) / Math.log(getRight().evaluate());
    }

    @Override
    public String toString() {
        return getLeft().toString() + " _ " + getRight().evaluate();
    }
}
