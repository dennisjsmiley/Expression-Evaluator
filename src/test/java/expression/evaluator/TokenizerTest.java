package expression.evaluator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TokenizerTest {

    @Test
    public void testTokenizer() {
        String expression = "2 * 5.0 + 1 / 2 - 4";

        Tokenizer tokenizer = new Tokenizer();
        List<String> tokens = tokenizer.tokenize(expression);

        List<String> expected = Arrays.asList("2", "*", "5.0", "+", "1", "/", "2", "-", "4");
        assertEquals(expected, tokens);

    }
}