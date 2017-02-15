/*Given two strings with any value of any length return the resulting string of alternating characters from one and the other.
    
Example with strings of the same size: given the strings "Hello" and "World" then
the result string is "HWeolrllod". In this case the first character in the result
must be the first character of the first function parameter.

With Strings of different sizes repeat the mixing till the end of the larger string repeating characters of the smaller one.
Example: given the strings "Drinking" and "beer" the the result is "Dbreienrkbienegr".
With strings of different sizes the result must start with the first character of the larger one.

The result must always end with a character of the other string value than the one used to start the result value.

White spaces do not have to be taken into account even when calculating string sizes ("abcd" is larger than "a b c")
Example: with strings "Biking" and "the city" the result should be "tBhiekciintgyB"*/

public class StringInterlacing{
    
    public static void main(String[] args){

    	System.out.println(interlace("Hello", "World"));
    	System.out.println(interlace("Drinking", "beer"));
    	System.out.println(interlace("Gimme", "some lovin'"));
    }

    public static String interlace(final String first, final String second){

    	String x = first.replaceAll("\\s", "");
    	String y = second.replaceAll("\\s", "");
    	String result = "";

    	if(x.length() == y.length()){
    		for(int i = 0; i<x.length(); i++){
    			result += (Character.toString(x.charAt(i)) + Character.toString(y.charAt(i)));
    		}
    	}else if(x.length() > y.length()){
    		for(int i =0; i<x.length(); i++){
    			if(i < y.length()){
    				result += (Character.toString(x.charAt(i)) + Character.toString(y.charAt(i)));
    			}else{
    				result += (Character.toString(x.charAt(i)) + Character.toString(y.charAt(i - y.length())));
    			}
    		}
    	}else{
    		for(int i =0; i<y.length(); i++){
    			if(i < x.length()){
    				result += (Character.toString(y.charAt(i)) + Character.toString(x.charAt(i)));
    			}else{
    				result += (Character.toString(y.charAt(i)) + Character.toString(x.charAt(i - x.length())));
    			}
    		}
    	}

    	return result;
    }
}
