package expression.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

    private final String tokensRegex = "([+-]?([0-9]*[.])?[0-9]+)|(\\+)|(\\-)|(\\*)|(\\/)|(\\^)|(_)|(\\()|(\\))";

    public List<String> tokenize(String expression) {
        List<String> tokens = new ArrayList<>();

        Pattern tokenPattern = Pattern.compile(tokensRegex);
        Matcher matcher = tokenPattern.matcher(expression);

        while (matcher.find()) {
            String token = matcher.group();
            tokens.add(token);
        }

        return tokens;
    }
}
