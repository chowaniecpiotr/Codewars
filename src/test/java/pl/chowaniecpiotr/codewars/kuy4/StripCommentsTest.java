package pl.chowaniecpiotr.codewars.kuy4;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

@Test
public class StripCommentsTest {

    @Test
    public void testStripComments() {
        assertEquals(
                StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}),
                        "apples, pears\ngrapes\nbananas");
        assertEquals(
                StripComments.stripComments("a #b\nc\nd $e f g", new String[]{"#", "$"}),
                        "a\nc\nd");
    }
}
