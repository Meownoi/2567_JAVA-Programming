
public class Book {
	private String title;
	private Author author; //composition concept
	private int page;
	
	//constructor Method
	
	Book(String title,Author author,int page){
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	
	Book(String title,Author author){
		/*this.title = title;
		this.author = author;
		this.page = 0;*/
		this(title,author,0);	
	}
	
	
	Book(){
		//this(null,null,0);
		this.title = null;
		this.author = null;
		this.page = 0;
	}
	
	//setter & getter method
	public String getTitle() {
		return this.title;
	}
	
	
	public Author getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getPage() {
		return this.page;
	}
	
	//toString() Method
	public String toString() {
		return getTitle() + " has " + getPage() + " pages write by " + getAuthor();
	}
}

