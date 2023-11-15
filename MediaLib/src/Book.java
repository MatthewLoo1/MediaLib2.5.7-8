public class Book
{
  private int rating;
  private String title;
  private String author;
 
  /*** Constructor ****/
  public Book(String t, String a)
  {
	title = t;
	author = a;
  // System.out.println("Adding book " + t);
  }
 
   /*** Accessor methods ***/
  public String getTitle() {
	return title;
  }
 
  public String getAuthor() {
	return author;
  }
 
  public int getRating() {
	return rating;
  // return r;
  }
 
  public String toString()  
  {
  String info = "\"" + title + "\", written by " + author;
	if (rating != 0)  
 	info += ", rating is " + rating;
	 
	return info;
  }
 
  // Step 23 - 29
  public boolean equals(Book b)
  {
    // System.out.println("Checking book " + t);
	// variations of the if statement:
	// if(b.title.equals(getTitle()) && b.author.equals(getAuthor()))
	// if(title.equals(b.title) && author.equals(b.author))
	// if(b.title.equals(title) && b.author.equals(author))
	if(this.title.equals(b.title) && this.author.equals(b.author))
  	return true;  
	return false;
 
  }
 
  /*** Mutator methods ***/
  public void setAuthor(String a) {
	author = a;
  }
	 
  public void setTitle(String t) {
	title = t;
  }
 
  // Step 7: create the method
  public void adjustRating(int r)
  {
    System.out.println("Adjusting rating by " + r);
	// Step 10-11 improve the method
	if ((rating + r >= 0) && (rating + r <= 10))
  	rating += r;
 
	r = 10;// Step 9: changing the param here has no effect in the runner
 
  }
  
//   public String getInfo()
// {
//    return "The current book information is " + info;
// }
 
}

