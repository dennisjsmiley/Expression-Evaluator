package expression.evaluator.operation;

import expression.evaluator.node.DoubleNumber;
import expression.evaluator.node.Node;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class SubtractionOperationTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testSubtractionOperation() {
        Node seven = new DoubleNumber(7);
        Node three = new DoubleNumber(3);
        BinaryOperation subOp = new SubtractionOperation(seven, three);

        double result = subOp.evaluate();
        assertEquals(4, result, 0);

        logger.info(subOp.toString() + " = " + result);
    }

    @Test
    public void testSubtractionAndAddition() {
        Node two = new DoubleNumber(2);
        Node five = new DoubleNumber(5);
        BinaryOperation addOp = new AdditionOperation(two, five);

        Node three = new DoubleNumber(3);
        BinaryOperation subOp = new SubtractionOperation(addOp, three);

        double result = subOp.evaluate();
        assertEquals(4, result, 0);

        logger.info(subOp.toString() + " = " + result);
    }
}
