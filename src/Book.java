
public class Book {
	
	 static String title;
	 static String author;
	 static int price;
	 static String isbn;

	 public Book(String title, String author, int price, String isbn) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}
	 
	public void displayDetails() {
		System.out.println("Book details are : " +title+ "\t"  +author+ "\t"  +price+ "\t"  +isbn);
	}
	
	public void discountedPrice() {
		int discountedPrice;
		discountedPrice = (price * 10) /100;
		int remainingPrice = price - discountedPrice;
		System.out.println("Remaining price to be paid is : "+remainingPrice);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Physics","Nagappan",800,"ISB72UDDB");
		b.displayDetails();
		b.discountedPrice();
	}

}
