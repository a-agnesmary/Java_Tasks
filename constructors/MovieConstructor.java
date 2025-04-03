package constructors;

import java.util.List;
import java.util.ArrayList;

public class MovieConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieDTO obj1 = new MovieDTO("Dragon","Comedy-Drama","Ashwath Marimuthu","21-02-2025",4.0, 2.37f,List.of("Pradeep Ranganathan", "Anupama Parameswaran", "VJ Siddhu"));
		MovieDTO obj2 = new MovieDTO("Amaran","Action-Thriller","Karthik G. Krish","15-08-2025",4.5,2.45f,List.of("Sivakarthikeyan","Sai Pallavi","Rahul Bose"));
		MovieDTO.addMovie(obj1);
		MovieDTO.addMovie(obj2);
		
		MovieDTO.printAllMovies();
	}

}
class MovieDTO {
	private String title;
    private String genre;
    private String director;
    private String releaseDate;
    private double rating;
    private float durationMinutes;
    private List<String> actors;
    
    private static List<MovieDTO> allMovies = new ArrayList<>();
    
    public MovieDTO(String title, String genre, String director, String releaseDate, double rating, float durationMinutes, List<String> actors) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actors = new ArrayList<>(actors);
    }

    
	public static void addMovie(MovieDTO movie) {
		allMovies.add(movie);
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public float getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(float durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public static void printAllMovies() {
        System.out.println("***** All Employee *****");
        int i=1;
        for (MovieDTO movie : allMovies) {
            System.out.println((i++)+"."+movie);
        }
    }
	
	@Override
	public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", rating=" + rating +
                ", durationMinutes=" + durationMinutes +
                ", actors=" + actors +
                '}';
    }
}
