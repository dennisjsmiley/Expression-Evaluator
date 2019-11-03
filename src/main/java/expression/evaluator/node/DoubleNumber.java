package expression.evaluator.node;

import expression.evaluator.node.Node;

public class DoubleNumber extends Node {
    private final double value;

    public DoubleNumber(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
