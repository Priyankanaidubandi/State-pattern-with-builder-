
public abstract class BookBuilder {
	
	String name ;
	
	BookType type ;
	
	public abstract void addPages();
	
	public abstract void addContent();
	public abstract void removeContent();
	public abstract void changeContent();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

}
