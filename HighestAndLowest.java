import java.util.Arrays;


public class HighestAndLowest{
	public static void main(String[] args){

		System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		System.out.println(HighAndLow("1 2 3 4 5")); // return "5 1"
		System.out.println(HighAndLow("1 2 -3 4 5")); // return "5 -3"
		System.out.println(HighAndLow("1 9 3 4 -5")); // return "9 -5"
	}

	public static String HighAndLow(String numbers){


		String[] arrayOfStrings = numbers.split(" ");
		int[] arrayOfInt = new int[arrayOfStrings.length];

		for(int i =0; i < arrayOfStrings.length; i++){

			arrayOfInt[i] = Integer.parseInt(arrayOfStrings[i]);
		}

		Arrays.sort(arrayOfInt);

		return arrayOfInt[arrayOfInt.length - 1] + " " + arrayOfInt[0];
	}
}