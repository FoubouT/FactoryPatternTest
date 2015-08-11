package com.core.shapes;

class Square extends Shape {

	private double side;

	/* Class Methods */
	@Override
	public double calculateSurfaceArea() {

		return Math.pow( side, 2 );
	}

	/* Mutator - Getters & Setters */
	public double getSide() {

		return side;
	}

	public void setSide( double side ) {

		this.side = side;
	}
}
