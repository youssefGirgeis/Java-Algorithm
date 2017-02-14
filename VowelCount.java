
//Return the number (count) of vowels in the given string.



public class VowelCount{

	public static void main(String[] args){
        
        System.out.println(getCount("abracadabra"));
        
        
    }
    
    public static int getCount(String str){

    	int vowelsCount = 0;

    	char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    	for(int i = 0; i< vowels.length; i++){
    		for(int j =0; j<str.length(); j++){
    			if(str.charAt(j) == vowels[i]){
    				vowelsCount++;
    			}
    		}
    	}

    	return vowelsCount;
    }
    
}