import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n,fact=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 n=sc.nextInt();
	     int i=1;
	     do
	     {
	            fact=fact*i;
	            i++;
	     }while(i<=n);
	                  
	     System.out.println("factorial is = "+fact);
	}

}
