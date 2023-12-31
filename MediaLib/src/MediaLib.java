public class MediaLib
{
  private Movie movie;
  private Book book;
  private Song song;
  public static String owner = "PLTW";
  private static int numEntries;

  //Step 22 and 24
  public void addBook(Book b) {
    if (book == null) {
        book = b;
        numEntries++;
    } else {
        System.out.println("Library already contains a book. Cannot add another book.");
    }
}
  public void addMovie(Movie m) {
      if (movie == null) {
          movie = m;
          numEntries++;
      } else {
          System.out.println("Library already contains a movie. Cannot add another movie.");
      }
  }
//Step 27
  public void addSong(Song s) {
    if (song == null) {
        song = s;
        numEntries++;
    } else {
        System.out.println("Library already contains a song. Cannot add another song.");
    }
}
 // optional step 24
public void changeBook(Book newBook) {
  if (book != null) {
      book = newBook;
      System.out.println("Book replaced in the library.");
  } else {
      System.out.println("No book exists in the library to be replaced.");
  }
}
   
  // new step 18-22
  /* test scenario
  public void testBook(Book tester)
  {
	tester.setTitle("Animal Farm");
	// show state chagne with one of the following
	System.out.println(" in test: " + tester);
	System.out.println(" in test: " + tester.getTitle());
  }
  */
   
  public String toString() {
    String info = "";

    if (book != null) {
        info += "Book: " + book + "\n";
    }
    if (song != null) {
        info += "Song: " + song;
    }

    return info;
}

  //Step 8
  public void changeOwner(String newOwner) {
    owner = newOwner;
  }

  public static String getOwner() {
      return owner;
  }

  public static int getNumEntries() {
    //System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

}
