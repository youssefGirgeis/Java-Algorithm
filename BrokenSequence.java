/*
You have a sequence of positive numbers starting with 1, but one number is missing!

Find out the missing number; if the sequence is not broken, you should return 0. Each sequence always increments by 1.

In short: an invalid sequence (a string with non numeric character) must return 1, an already complete (or empty) sequence must return 0; a broken sequence with more than one number missing should return the lowest missing number; otherwise return the missing number.

Note that the input may be with random order.
*/

import java.util.Arrays;
public class BrokenSequence{
    
    public static void main(String[] args){
        
        System.out.println(new BrokenSequence().findMissingNumber("1 3 2 5"));//work
        System.out.println(new BrokenSequence().findMissingNumber("1 5"));//work
        System.out.println(new BrokenSequence().findMissingNumber("1 2 3 4"));//work
        System.out.println(new BrokenSequence().findMissingNumber("2 1 4 3 a"));//work
        System.out.println(new BrokenSequence().findMissingNumber(""));//work
        System.out.println(new BrokenSequence().findMissingNumber("2 3 4 5")); // doesn't work
        System.out.println(new BrokenSequence().findMissingNumber("2 3 4 5 6")); // doesn't work
        
        //int[] x ={1,2,3,4};
        //System.out.println(Arrays.toString(x));
        
      }
    
    
        public int findMissingNumber(String sequence){
        int missing = 0;
            
        if(sequence != ""){
        
        String[] arrayOfNumbers = sequence.split(" ");
        //System.out.println(Arrays.toString(arrayOfNumbers));
        //System.out.println(arrayOfNumbers[0] + arrayOfNumbers[1]);
            
        int[] intArray = new int[arrayOfNumbers.length]; 
            
        int i =0;
        for(String num : arrayOfNumbers){
            if(Character.isLetter(num.charAt(0))){
                intArray[i] = 00;
            }else{
            intArray[i] = Integer.parseInt(num);
            i++;
            }
        }
        
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
            
        for(int j=1; j<intArray.length; j++){
            if(intArray[j-1] == 00){
                missing = 1;
                break;
            }
            
            if((intArray[j] - intArray[j-1]) > 1){
                missing = intArray[j-1] + 1;
            }else{
                missing = 0;
            }
        }
        }else{
            missing = 0;
        }
        
        return missing;
    }
    
}