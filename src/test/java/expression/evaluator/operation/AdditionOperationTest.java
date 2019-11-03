package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class AdditionOperationTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testArithmeticOperation() {
        Node two = new DoubleNumber(2);
        Node five = new DoubleNumber(5);
        BinaryOperation addOp = new AdditionOperation(two, five);

        double result = addOp.evaluate();
        assertEquals(7d, result, 0);

        logger.info(addOp.toString() + " = " + result);
    }


}
