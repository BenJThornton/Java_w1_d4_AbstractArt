package com.AbstractArt;

public class Sculpture extends Art {
	private String material;
	
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public void viewArt() {
		System.out.println("made using: " + material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
