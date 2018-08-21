
public class Movie {
	
	protected String Name;
	protected String Director;
	protected int Year;
	protected int Length;
	
	public Movie(String MovieName, String MovieDirector, int ReleaseYear, int MovieLength) {
		
		this.Name = MovieName;
		this.Director = MovieDirector;
		this.Year = ReleaseYear;
		this.Length = MovieLength;
		
	}
	//This is my constructor.
	
	public String getName() {
		return this.Name;
	}
	public String getDirector() {
		return this.Director;
	}
	public int getYear() {
		return this.Year;
	}
	public int getLength() {
		return this.Length;
	}
	//These are my accessors.
	
	public void setName(String name) {
		this.Name = name;
	}
	public void setDirector(String director) {
		this.Director = director;
	}
	public void setYear(int year) {
		this.Year = year;
	}
	public void setLength(int length) {
		this.Length = length;
	}
	//These are my mutators.
	
	public String toString() {
		return "The name of the movie is " + this.Name + ", and it was directed by " 
				+ this.Director + ". It was realeased in the year " + this.Year + 
				", and it lasts for " + this.Length + " minutes.";
	}

}
