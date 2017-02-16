

public class BitCounting{
    
    public static void main(String[] args){

    	System.out.println(countBits(7)); // 3
    	System.out.println(countBits(1234)); // 5
    	System.out.println(countBits(10)); // 2
    }

    public static int countBits(int n){

    	int bitsCounter = 0;
    	String binaryString = Integer.toBinaryString(n);
    	for(char bit : binaryString.toCharArray()){
    		bitsCounter += (bit == '1') ? 1 : 0;
    	}
    	return bitsCounter;
    }
}