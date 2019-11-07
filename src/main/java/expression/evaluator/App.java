package expression.evaluator;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import expression.evaluator.operation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        String expression = "2 + 5 + 1 + 2 - 5";

        Tokenizer tokenizer = new Tokenizer();
        List<String> tokens = tokenizer.tokenize(expression);

        Node tree = parseTokens(tokens);
        logger.info("{} = {}", tree, tree.evaluate());
    }

    private static Node parseTokens(List<String> tokens) {
        return parseTokens(tokens, null);
    }

    private static Node parseTokens(List<String> tokens, Node tree) {
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
                }

                return result;
            }
        }
    }
}
