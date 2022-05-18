package pl.chowaniecpiotr.codewars.kyu5;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

@Test
public class ValidParenthesesTest {

    public void sampleTest() {
        // assertEquals("expected", "actual");
        assertEquals(true,ValidParentheses.validParentheses( "()" ));
        assertEquals(false,ValidParentheses.validParentheses( "())" ));
        assertEquals(true,ValidParentheses.validParentheses( "32423(sgsdg)" ));
        assertEquals(false,ValidParentheses.validParentheses( "(dsgdsg))2432" ));
        assertEquals(true,ValidParentheses.validParentheses( "adasdasfa" ));
    }
}
