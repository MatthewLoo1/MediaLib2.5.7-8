public class Movie
{
    private String title;
    private double duration;
    private int rating;
    
    /*** Constructor ****/
    public Movie(String t, double d)
    {
      title = t;
      duration = d;
      rating = 0;
    }
    
     /*** Accessor methods ***/
    public String getTitle() {
      return title;
    }
  
    public double getDuration() {
      return duration;
    }
    
    public int getRating() {
      return rating;
    }
  
    public void adjustRating(int r)
    {
      rating += r;
      if (rating > 10)
      {
        rating = 10;
      }
      else if (rating < 0)
      {
        rating = 0;
      }
    }
    
    public String toString() 
    {
      String info = "\"" + title + "\", length of " + duration + " hours";
      if (rating != 0) 
      { 
        info += ", rating is " + rating;
      }
      return info;
    }
  
    public boolean equals(Movie b)
    {
      return b.title.equals(this.title) && b.duration == this.duration;
    }
    /*** Mutator methods ***/
    public void setTitle(String t) {
      title = t;
    }
  
    public void setDuration(double a) {
      duration = a;
    }
}
