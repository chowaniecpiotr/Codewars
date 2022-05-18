package pl.chowaniecpiotr.codewars.kyu5;

/**
 * @author Piotr Chowaniec
 */
public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        int counter = 0;
        for (char c : parens.toCharArray()) {
            if (c == ')' && counter == 0) return false;
            if (c == '(') counter++;
            if (c == ')') counter--;
        }
        return counter == 0;
    }
}
