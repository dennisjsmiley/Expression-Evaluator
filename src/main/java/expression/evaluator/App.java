package expression.evaluator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
//        String input = "9 + 11 * 55 / .66 ^ 44.9 _ 2 * ( 2 + 1 )";
        String input = "2 * 5 + 1";

//        String tokensRegex = "([+-]?([0-9]*[.])?[0-9]+)|(\\+)|(\\-)|(\\*)|(\\/)|(\\^)|(_)|(\\()|(\\))";
//
//        Pattern tokenPattern = Pattern.compile(tokensRegex);
//        Matcher matcher = tokenPattern.matcher(input);
//
//        while(matcher.find()) {
//            String token = matcher.group();
//            logger.info("token: {}", token);
//        }
    }
}
