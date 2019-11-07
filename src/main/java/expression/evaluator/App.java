package expression.evaluator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        String expression = "3 * 5 + 2 * 2 - 5 / 5";

        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        double result = evaluator.evaluate(expression);

        logger.info("{} = {}", expression, result);
    }

}
