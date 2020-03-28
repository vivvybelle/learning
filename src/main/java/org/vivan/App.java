package org.vivan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getMessage("fred", "?"));
    }
    
    public static String getMessage(String name, String punctuation) {
    	if (null == name || 0 == name.length()) {
    		return "Hello" + punctuation
;
    	} else {
    		return "Hello " + name + punctuation;
    	}
    }
}
