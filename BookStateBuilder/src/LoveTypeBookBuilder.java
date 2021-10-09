
public class LoveTypeBookBuilder extends BookBuilder {

	@Override
	public void addPages() {
		 System.out.println("Combinding the pages into book");
		
	}

	@Override
	public void addContent() {
		System.out.println("Add some Love Content to the book");
		
	}

	@Override
	public void removeContent() {
		System.out.println("remove some Love Content to the book");
		
	}

	@Override
	public void changeContent() {
		System.out.println("Change some Love Content to the book");
		
	}

}
