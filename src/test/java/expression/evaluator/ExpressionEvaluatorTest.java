package expression.evaluator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpressionEvaluatorTest {

    @Test
    public void testExpressionEvaluator() {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();

        assertEquals(2 + 2, evaluator.evaluate("2 + 2"), 0);
        assertEquals(2 * 5 + 2, evaluator.evaluate("2 * 5 + 2"), 0);
        assertEquals(2 * 5 + 2 - 5 / 5, evaluator.evaluate("2 * 5 + 2 - 5 / 5"), 0);
    }
}
