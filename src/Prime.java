import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		boolean flag = false;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}
