package classesAndObjects;

import java.time.LocalDate;
import java.util.List;

public class MovieDTO {
	private String title;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private double rating;
    private int durationMinutes;
    private List<String> actors;
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
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}

}
