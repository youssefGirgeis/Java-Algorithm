

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
