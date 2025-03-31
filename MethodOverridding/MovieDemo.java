package MethodOverridding;

import java.time.LocalDate;
import java.util.List;

// Parent class
class Movie {
    protected String title;
    protected String genre;
    protected String director;
    protected LocalDate releaseDate;
    protected double rating;
    protected int durationMinutes;
    protected List<String> actors;

    public Movie(String title, String genre, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actors = actors;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Actors: " + actors);
    }
}

class RomComMovie extends Movie {
    public RomComMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        super(title, "Romantic Comedy", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Special Feature: Light-hearted romantic moments with humor.");
    }
}

// Child class for Thriller movies
class ThrillerMovie extends Movie {
    public ThrillerMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        super(title, "Thriller", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Special Feature: Intense suspense and unexpected twists.");
    }
}

class HorrorMovie extends Movie {
    public HorrorMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        super(title, "Horror", director, releaseDate, rating, durationMinutes, actors);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Special Feature: Scary scenes and eerie atmosphere.");
    }
}

public class MovieDemo {
    public static void main(String[] args) {
    	Movie movie1 = new RomComMovie("Crazy Rich Asians", "Jon M. Chu", LocalDate.of(2018, 8, 15), 7.0, 120, List.of("Constance Wu", "Henry Golding"));
    	Movie movie2 = new ThrillerMovie("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 16), 8.8, 148, List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt"));
    	Movie movie3 = new HorrorMovie("The Conjuring", "James Wan", LocalDate.of(2013, 7, 19), 7.5, 112, List.of("Vera Farmiga", "Patrick Wilson"));

    	Movie[] movies = {movie1, movie2, movie3};
        for (Movie movie : movies) {
            movie.displayDetails();
            System.out.println("----------------------");
        }
    }
}