import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a 4 digit number");
		Scanner s = new Scanner(System.in);
		int sum = 0,n = 0;
		int num = s.nextInt();
		while (num > 0) {
			n = num % 10;
			sum = sum + n;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
