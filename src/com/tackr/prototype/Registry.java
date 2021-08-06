package com.tackr.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("The Little Mermaid");
		movie.setPrice(14.99);
		movie.setRuntime("2h");
		
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(9.99);
		book.setTitle("Peter Pan");
		
		items.put("Book", book);
	}
}
