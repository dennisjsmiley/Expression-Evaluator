package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testMultiplicationOperation() {
        Node two = new DoubleNumber(2);
        Node five = new DoubleNumber(5);
        BinaryOperation mulOp = new MultiplicationOperation(two, five);

        double result = mulOp.evaluate();
        assertEquals(10, result, 0);

        logger.info(mulOp.toString() + " = " + result);
    }
}
