package com.core.shapes;

class Rectangle extends Shape {

	private double length;
	private double height;

	/* Class Methods */
	@Override
	public double calculateSurfaceArea() {

		return length * height;
	}

	/* Mutator - Getters & Setters */
	public double getLength() {

		return length;
	}

	public void setLength( double length ) {

		this.length = length;
	}

	public double getHeight() {

		return height;
	}

	public void setHeight( double height ) {

		this.height = height;
	}
}
