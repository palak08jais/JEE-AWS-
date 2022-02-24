package lab4;

public class Book extends WrittenItem{
	Book(){
		
	}
	
	Book(int uID, String title, String author, int no_of_copies){
		super(uID, title, author, no_of_copies);
	}

	@Override
	public String toString() {
		super.toString();
		return "Book []";
	}
	
	
}