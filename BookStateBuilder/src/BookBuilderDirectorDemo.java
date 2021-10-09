
public class BookBuilderDirectorDemo {

	public static void main(String[] args) {
		 
		State bookbuilder = new BookState();
		
		bookbuilder.build();
		
		bookbuilder.addContent();
		
		bookbuilder.changeContent();
		
		bookbuilder.removeContent();
		
		bookbuilder.publish();

	}

}
