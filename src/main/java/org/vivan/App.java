package org.vivan;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getMessage("fred"));
    }
    
    public static String getMessage(String name) {
    	if (null == name || 0 == name.length()) {
    		return "Hello!";
    	} else {
    		return "Hello " + name.substring(0, 1).toUpperCase() +name.substring(1) + "!";
    	}
    }
}
