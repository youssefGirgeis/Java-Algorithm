/*
Description:

Given an array of one's and zero's convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class OnesAndZeros{

	public static void main(String[] args){

		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));//1
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,1,0))));//2
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,0,1))));//5
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));//9
	}

	public static int ConvertBinaryArrayToInt(List<Integer> binary){

		int result = 0;

		for(int i = 0; i < binary.size(); i++){

			if(binary.get(i) == 1){

				result += Math.pow(2, (binary.size() - 1) - binary.indexOf(binary.get(i)));

				binary.set(binary.indexOf(binary.get(i)), 2);

			}

		}

		return result;
	}
} 


/*
	--Clever Solution -1--

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        
        int number = 0;
        for (int bit : binary)
            number = number << 1 | bit;
        return number;
    }

    --Clever Solution -2--

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
    String res = "";
    
    for (int i : binary)
            res += i; 
        
    return Integer.parseInt(res, 2);
    }
	

	--Clever Solution -3--

     public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }

*/