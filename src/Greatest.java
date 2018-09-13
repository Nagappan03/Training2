
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{12,64,2};
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Highest element in an array is : "+max);
	}

}
