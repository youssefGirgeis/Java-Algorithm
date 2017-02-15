/*
Create a function that takes an integer as an argument and returns "Even" for even 
numbers or "Odd" for odd numbers.
*/

public class EvenOrOdd{
    
    public static void main(String[] args){

    	System.out.println(even_or_odd(7));
    	System.out.println(even_or_odd(8));
    }

    public static String even_or_odd(int number){

    	return (number % 2 == 0) ? "even" : "odd";

    }
}
