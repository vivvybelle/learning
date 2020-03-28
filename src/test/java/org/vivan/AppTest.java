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
    public void getMessageTest(String in, String expected)
    {
		assertEquals(App.getMessage(in), expected);
    }

	@DataProvider
	public Object[][] getMessageTestDP() {
		return new Object[][] {
			{null, "Hello!"},
			{"", "Hello!"},
			
			{"s", "Hello S!"},
			
			{"bob", "Hello Bob!"},
			{"fred", "Hello Fred!"},
		};
	}
}
