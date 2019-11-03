package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class PowerOperationTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testPowerOperation() {
        Node two = new DoubleNumber(2);
        Node three = new DoubleNumber(3);
        BinaryOperation powOp = new PowerOperation(two, three);

        double result = powOp.evaluate();
        assertEquals(8, result, 0);

        logger.info(powOp.toString() + " = " + result);
    }
}
