package expression.evaluator.operation;

import expression.evaluator.node.Node;

public abstract class BinaryOperation extends Node {
    private final Node left;
    private final Node right;

    public BinaryOperation(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    public abstract double evaluate();

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
