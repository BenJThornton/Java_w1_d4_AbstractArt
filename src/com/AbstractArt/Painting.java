package com.AbstractArt;

public class Painting extends Art{
	private String paintType;
	
	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	public void viewArt() {
		System.out.println(this.getTitle() + " made using: " + this.getPaintType() + " by " + this.getAuthor());
		System.out.println("Description: " + this.getDescription());
	}
	public String getPaintType() {
		return paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
}
