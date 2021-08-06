package com.tackr.prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Movie movie = (Movie) registry.createItem("Movie");
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(movie);
		System.out.println(new StringBuilder().append("Runtime: ").append(movie.getRuntime()));
		System.out.println(new StringBuilder().append("Title: ").append(movie.getTitle()));
		System.out.println(new StringBuilder().append("Url: ").append(movie.getUrl()));

		Movie anotherMovie = (Movie) registry.createItem("Movie");
		anotherMovie.setTitle("Gang of Four");
		
		System.out.println(anotherMovie);
		System.out.println(new StringBuilder().append("Runtime: ").append(anotherMovie.getRuntime()));
		System.out.println(new StringBuilder().append("Title: ").append(anotherMovie.getTitle()));
		System.out.println(new StringBuilder().append("Url: ").append(anotherMovie.getUrl()));
	}
	
}
