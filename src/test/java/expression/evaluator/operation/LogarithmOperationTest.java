package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class LogarithmOperationTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testLogarithmOperation() {
        Node eight = new DoubleNumber(8);
        Node two = new DoubleNumber(2);
        BinaryOperation logOp = new LogarithmOperation(eight, two);

        double result = logOp.evaluate();
        assertEquals(3, result, 0);

        logger.info(logOp.toString() + " = " + result);
    }
}
