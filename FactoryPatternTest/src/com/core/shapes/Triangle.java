package com.core.shapes;

class Triangle extends Shape {

	private double base;
	private double height;

	/* Class Methods */
	@Override
	public double calculateSurfaceArea() {

		return ( base * height ) / 2;
	}

	/* Mutator - Getters & Setters */
	public double getBase() {

		return base;
	}

	public void setBase( double base ) {

		this.base = base;
	}

	public double getHeight() {

		return height;
	}

	public void setHeight( double height ) {

		this.height = height;
	}

}
