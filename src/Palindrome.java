import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string to check if it is a palindrome");  
	      original = in.next();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  {
	         reverse = reverse + original.charAt(i);
	      }
	      if (original.equalsIgnoreCase(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome."); 
	}

}
