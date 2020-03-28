package org.vivan;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	@Test
    public void instantiationTest()
    {
        new App();
    }
	
	@Test(dataProvider = "getMessageTestDP")
    public void getMessageTest(String name, String punctuation, String expected )
    {
		assertEquals(App.getMessage(name, punctuation), expected);
    }

	@DataProvider
	public Object[][] getMessageTestDP() {
		return new Object[][] {
			//exclamation mark
			{null, "!", "Hello!"},
			{"", "!", "Hello!"},
			
			{"s", "!", "Hello s!"},
			
			{"bob", "!", "Hello bob!"},
			{"fred", "!", "Hello fred!"},

			//question mark
			{null, "?", "Hello?"},
			{"", "?", "Hello?"},
			
			{"s", "?", "Hello s?"},
			
			{"bob", "?", "Hello bob?"},
			{"fred", "?", "Hello fred?"},

		};
	}
}
