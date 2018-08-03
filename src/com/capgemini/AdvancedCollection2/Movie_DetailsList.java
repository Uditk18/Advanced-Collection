//Class movie details list defining all the methods such as add_movie,removie_move etc..

package com.capgemini.AdvancedCollection2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Movie_DetailsList {

// Creating Arraylist to store movie details

	static List<MovieDetails> movie_list = new ArrayList<>();

// Method to add movies in the list
	public void add_movie(MovieDetails movieName) {
		movie_list.add(movieName);

	}

	public void remove_name(String movieName) {
		Predicate<MovieDetails> deleteMovie = MovieDetails -> MovieDetails.getMov_Name().equals(movieName);
		movie_list.removeIf(deleteMovie);
	}

	public void remove_AllMovies() {
		movie_list.clear();
		System.out.println("All movies are deleted!");
	}

	public static boolean find_movie_By_mov_Name(String movieName) {
		Predicate<MovieDetails> pred = MovieDetails -> (MovieDetails.getMov_Name().equals(movieName));
		return movie_list.stream().anyMatch(pred);
	}

	public static boolean find_movie_By_Genre(String genre) {
		Predicate<MovieDetails> pred1 = MovieDetails -> (MovieDetails.getGenre().equals(genre));
		return movie_list.stream().anyMatch(pred1);
	}

	public void display() {
		Consumer<MovieDetails> disp = System.out::println;
		movie_list.stream().forEach(disp);
	}

}
