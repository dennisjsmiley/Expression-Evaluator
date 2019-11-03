package expression.evaluator.operation;

import expression.evaluator.node.Node;

public class PowerOperation extends BinaryOperation {
    public PowerOperation(Node left, Node right) {
        super(left, right);
    }

    @Override
    public double evaluate() {
        return Math.pow(getLeft().evaluate(), getRight().evaluate());
    }

    @Override
    public String toString() {
        return getLeft().toString() + " ^ " + getRight().toString();
    }
}
