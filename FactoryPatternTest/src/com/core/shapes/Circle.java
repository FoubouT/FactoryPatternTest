package com.core.shapes;

class Circle extends Shape {

	private double radius;

	/* Class Methods */
	@Override
	public double calculateSurfaceArea() {

		return Math.PI * Math.pow( radius, 2 );
	}

	/* Mutator - Getters & Setters */
	public double getRadius() {

		return radius;
	}

	public void setRadius( double radius ) {

		this.radius = radius;
	}

}
