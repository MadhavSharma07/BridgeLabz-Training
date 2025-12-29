package gcr-codebase.linkedlist;


class Movie{      //Movie Node class 
	String movieTitle;
	String director;
	int yearOfRelease;
	int rating;
	Movie next;
	Movie prev;
	Movie(String movieTitle, String director,int yearOfRelease,int rating){  // constructor
		this.movieTitle=movieTitle;
		this.director=director;
		this.yearOfRelease=yearOfRelease;
		this.rating=rating;
		this.next=null;
		this.prev=null;
	}
}
public class MovieManagementSystem {   // main class
	Movie head;
	Movie tail;
	static int size;
	
	public void addMovieForward(String movieTitle, String director,int yearOfRelease,int rating) { // method to add movie at begin
		Movie newMovie = new Movie(movieTitle,director,yearOfRelease,rating);
		if(head==null) {
			head=newMovie;
			tail=newMovie;
			return ;
		}
		newMovie.next=head;
		head.prev=newMovie;
		head= newMovie;
		size++;
		
	}
	public void addMovieBackward(String movieTitle, String director,int yearOfRelease,int rating) {   // method to add movie at last
		Movie newMovie = new Movie(movieTitle,director,yearOfRelease,rating);
		if(head==null) {
			head=newMovie;
			tail=newMovie;
			return;
		}
		tail.next=newMovie;
		newMovie.prev=tail;
		tail=newMovie;
		size++;
	}
	public void addMovieKthPosition(String movieTitle, String director,int yearOfRelease,int rating,int k) { //method to add movie at specific position K
		if(k==1) {
			 addMovieForward(movieTitle,director,yearOfRelease,rating);
			return;
		}
		if(k==size+1) {
			 addMovieBackward(movieTitle,director,yearOfRelease,rating);
				return;
		}
		Movie curr=head;
		for(int i=1;i<k-1;i++) {
			curr=curr.next;
		}
		Movie newMovie = new Movie(movieTitle,director,yearOfRelease,rating);
		newMovie.next=curr.next;
		curr.next=newMovie;
		newMovie.prev=curr;
		size++;
	}
	public void removeMovie(String movieTitle) { // method to delete movie
		if(head==null) {
			return;
		}
		if(head.movieTitle.equals(movieTitle)) {
			head=head.next;
			if(head!=null) head.prev=null;
			else tail =null;
			size--;
			return;
		}
		Movie curr=head.next;
		while(curr!=null) {
			if(curr.movieTitle.equals(movieTitle) ){
				curr.prev.next=curr.next;
				if(curr.next!=null) {
					curr.next.prev=curr.prev;
				}
				else {
					tail=curr.prev;
				}
				size--;
				return;
			}
			curr=curr.next;
		}
		System.out.print("Movie is not found");
	}
	public void searchMovie(String movieTitle,int rating) { // method to search movie
		Movie curr=head;
		while(curr!=null) {
			if(curr.movieTitle.equals(movieTitle) && curr.rating==rating) {
				System.out.println("Movie Found");
				System.out.println("Movie name: "+ movieTitle+ " rating: "+rating);
				return ;
			}
			curr=curr.next;
		}
		System.out.print("Movie is not found");

		
	}
	public void updateMovie(String movieTitle,int newRating) {        // method to modify movie
		Movie curr=head;
		while(curr!=null) {
			if(curr.movieTitle.equals(movieTitle) ) {
				System.out.println("Movie Found");
				curr.rating=newRating;
				System.out.println("Update rating ");
				return ;
			}
		}
	}
	public void displayBackword(){      //method to print linkedlist from back
		Movie curr=tail;
		if(tail==null) {
			System.out.println("List is empty");
			return ;
		}
		int i=1;
		while(curr!=null) {
			System.out.println("Movie no: "+i);
			System.out.println("Movie Title: "+ curr.movieTitle);
			System.out.println("director name: "+curr.director);
			System.out.println("Release date of movie: " +curr.yearOfRelease);
			System.out.println("rating of Movies: "+curr.rating);
			curr=curr.prev;
			System.out.println("\n");
			i++;
			
		}
		System.out.println();
	}
	public void displayForward(){ //method to print linkedlist from head
		Movie curr=head;
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		int i=1;
		while(curr!=null) {
			System.out.println("Movie no: "+i);
			System.out.println("Movie Title: "+ curr.movieTitle);
			System.out.println("director name: "+curr.director);
			System.out.println("Release date of movie: " +curr.yearOfRelease);
			System.out.println("rating of Movies: "+curr.rating);
			curr=curr.next;
			i++;
			System.out.println("\n");

			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	    MovieManagementSystem movie = new MovieManagementSystem();

	    
	    movie.addMovieBackward("Dhurandhar", "Ajay", 2025, 9);
	    movie.addMovieBackward("Kantara 1", "Rishab Shetty", 2021, 10);

	    movie.addMovieForward("Raaz", "abc", 1994, 7);

	    movie.addMovieKthPosition("Fun2", "altu", 1999, 8, 3);


	    System.out.println("Displaying all movies (forward):");
	    movie.displayForward();

	   
	    System.out.println("Displaying all movies (backward):");
	    movie.displayBackword();

	    System.out.println("Searching for 'Raaz' with rating 7:");
	    movie.searchMovie("Raaz", 7);

	 
	    System.out.println("\nSearching for 'Raaz' with rating 7:");
	    movie.searchMovie("Raaz", 7);

	    
	    System.out.println("\nRemoving 'Fun2':");
	    movie.removeMovie("Fun2");
	    System.out.println("\n Update Movie rating ");
	    movie.updateMovie("Raaz", 4);

	  
	    System.out.println("Displaying all movies after deletion:");
	    movie.displayForward();
	}


}