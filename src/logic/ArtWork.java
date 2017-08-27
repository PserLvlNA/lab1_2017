package logic;

import java.util.Arrays;

public class ArtWork {
//START CODE HERE
	private String name;
	private Artist[] artists;
	private String medium;
	private int year;
	private String id;
	private int price;
	
	public ArtWork(String name, Artist [] artists, String medium, int year, String id, int price) {
		this.name=name;
		this.artists=artists;
		this.medium=medium;
		this.year=year;
		this.id=id;
		this.price=price;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int newPrice) {
		price=newPrice;
	}
	public String getName() {
		return name;
	}
	public Artist[] getArtists() {
		return artists;
	}
	public String getMedium() {
		return medium;
	}
	public int getYear() {
		return year;
	}
	public String getId() {
		return id;
	}
	public String toString() {
		
	}
	


//END CODE HERE
//Hint: use Arrays.toString to print array	
}
