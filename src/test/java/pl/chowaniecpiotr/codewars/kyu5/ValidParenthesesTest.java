package pl.chowaniecpiotr.codewars.kyu5;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

@Test
public class ValidParenthesesTest {

    public void sampleTest() {
        assertTrue(ValidParentheses.validParentheses("()"), "True should be returned.");
        assertFalse(ValidParentheses.validParentheses("())"), "False should be returned.");
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"), "True should be returned.");
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"), "False should be returned.");
        assertTrue(ValidParentheses.validParentheses("adasdasfa"), "True should be returned.");
    }
}
