package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class DivisionOperationTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testDivisionOperation() {
        Node eight = new DoubleNumber(8);
        Node two = new DoubleNumber(2);
        BinaryOperation divOp = new DivisionOperation(eight, two);

        double result = divOp.evaluate();
        assertEquals(4, result, 0);

        logger.info(divOp.toString() + " = " + result);
    }

}
