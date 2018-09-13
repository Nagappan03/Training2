import java.util.*;
public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, d;
		char f = '*';
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows of floyd's triangle you want");
	      n = in.nextInt();
	 
	      System.out.println("Floyd's triangle :-");
	 
	      for ( c = 1 ; c <= n ; c++ )
	      {
	         for ( d = 1 ; d <= c ; d++ )
	         {
	            System.out.print(f+" ");
	         }
	 
	         System.out.println();
	      }
	}

}
