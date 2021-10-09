
public class BookState implements State {

	@Override
	public void build() {
		 System.out.println("Creating a book");
		
	}

	@Override
	public void addContent() {
		 System.out.println("Adding content to the book");
		
	}

	@Override
	public void removeContent() {
		System.out.println("remove content to the book");
		
	}

	@Override
	public void changeContent() {
		System.out.println("change content to the book");
		
	}

	@Override
	public void publish() {
		System.out.println("publish the book");
		
	}

}
