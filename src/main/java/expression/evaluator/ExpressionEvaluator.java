package expression.evaluator;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import expression.evaluator.operation.*;

import java.util.List;

public class ExpressionEvaluator {

    private final Tokenizer tokenizer = new Tokenizer();

    public double evaluate(String expression) {
        List<String> tokens = tokenizer.tokenize(expression);
        Node tree = parseTokens(tokens);
        return tree.evaluate();
    }

    private Node parseTokens(List<String> tokens) {
        return parseTokens(tokens, null);
    }

    private Node parseTokens(List<String> tokens, Node tree) {
        if (tree == null) {
            Node leaf = new DoubleNumber(Double.valueOf(tokens.get(0)));
            return parseTokens(tokens.subList(1, tokens.size()), leaf);
        } else {
            if (tokens.isEmpty()) {
                return tree;
            } else {
                Node result = null;
                String firstToken = tokens.get(0);
                switch (firstToken) {
                    case "+":
                        result = new AdditionOperation(tree, parseTokens(tokens.subList(1, tokens.size())));
                        break;
                    case "-":
                        result = new SubtractionOperation(tree, parseTokens(tokens.subList(1, tokens.size())));
                        break;
                    case "*":
                        BinaryOperation multOp = new MultiplicationOperation(tree, new DoubleNumber(Double.valueOf(tokens.get(1))));
                        result = parseTokens(tokens.subList(2, tokens.size()), multOp);
                        break;
                    case "/":
                        BinaryOperation divOp = new DivisionOperation(tree, new DoubleNumber(Double.valueOf(tokens.get(1))));
                        result = parseTokens(tokens.subList(2, tokens.size()), divOp);
                        break;
                }

                return result;
            }
        }
    }

}
