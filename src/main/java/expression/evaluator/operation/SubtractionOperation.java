package expression.evaluator.operation;

import expression.evaluator.node.Node;

public class SubtractionOperation extends BinaryOperation {
    public SubtractionOperation(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return getLeft().evaluate() - getRight().evaluate();
    }

    @Override
    public String toString() {
        return getLeft().toString() + " - " + getRight().toString();
    }
}
