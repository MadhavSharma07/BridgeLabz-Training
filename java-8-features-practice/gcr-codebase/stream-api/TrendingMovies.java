package stream_api;
import java.util.*;
import java.util.stream.Collectors;


public class TrendingMovies {
	public static void main(String[] args) {

	        List<Movie> movies = Arrays.asList(
	                new Movie("Movie A", 8.9, 2024),
	                new Movie("Movie B", 9.2, 2023),
	                new Movie("Movie C", 7.5, 2022),
	                new Movie("Movie D", 8.7, 2024),
	                new Movie("Movie E", 9.0, 2023),
	                new Movie("Movie F", 8.8, 2024),
	                new Movie("Movie G", 6.9, 2021)
	        );

	        // Top 5 trending movies (recent + high rating)
	        List<Movie> top5Movies =
	                movies.stream()
	                        .filter(m -> m.getReleaseYear() >= 2022)
	                        .sorted(
	                            Comparator.comparing(Movie::getRating).reversed()
	                        )
	                        .limit(5)
	                        .collect(Collectors.toList());

	        // Display result
	        top5Movies.forEach(m ->
	                System.out.println(
	                        m.getTitle() + " | Rating: " +
	                        m.getRating() + " | Year: " +
	                        m.getReleaseYear()
	                )
	        );
	    }
	}


class Movie {
    private String title;
    private double rating;
    private int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getTitle() {
        return title;
    }
}
