package exemplo.java;

import static org.junit.Assert.assertTrue;//importanto um metodo static

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testApp()
    {
        String expected = "Hello, World!";
		String actual = App.getGreeting();
		assertTrue( expected.equals(actual) );
    }
}
