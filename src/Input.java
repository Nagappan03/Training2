import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter an input");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (num >= 0) {
			System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is a negative number");
		}
	}

}
