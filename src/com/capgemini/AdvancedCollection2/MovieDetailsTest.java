//Main test class to test the given functionality

package com.capgemini.AdvancedCollection2;

public class MovieDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie_DetailsList movieObj = new Movie_DetailsList();

		movieObj.add_movie(new MovieDetails("Raid", "Akshay Kumar", "Ileana DCruz", "Drama/Crime"));
		movieObj.add_movie(new MovieDetails("Ae dil hai mushkil", "Ranbir Kapoor", "Anushka Sharma", "Drama/Romance"));
		movieObj.add_movie(new MovieDetails("Dangal", "Aamir Khan", "Fatima Shaikh", "Biographical Sports Drama"));

//		for(MovieDetails list1:list)
//		{
//			System.out.println(list1);
//		}

		boolean flag = Movie_DetailsList.find_movie_By_mov_Name("Dangal");
		if (flag == true) {
			System.out.println("\nMovie Found");
		} else {
			System.out.println("Movie not found");
		}

		boolean flag1 = Movie_DetailsList.find_movie_By_Genre("Drama/Crime");
		if (flag1 == true) {
			System.out.println("\nGenre Found");
		} else {
			System.out.println("Genre not found");
		}
		movieObj.remove_name("Raid");

		movieObj.display();
	}

}
