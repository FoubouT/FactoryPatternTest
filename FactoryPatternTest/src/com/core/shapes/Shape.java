package com.core.shapes;

import com.core.basics.Point;

public abstract class Shape {

	protected Point origin;

	/* Enumerations */
	public enum Shapes {
		CIRCLE, RECTANGLE, SQUARE, TRIANGLE
	}

	/* Class Methods */
	public void draw() {

		System.out.println( getClass().getSimpleName() + " drawn." );
	}

	public double getSurfaceArea() {

		return calculateSurfaceArea();
	}

	public String displayOriginCoordinates() {

		return "(" + getOrigin().getAbscissa() + ", " + getOrigin().getOrdinate() + ")";
	}

	/* Abstract Methods */
	protected abstract double calculateSurfaceArea();

	/* Mutator - Getters & Setters */
	public Point getOrigin() {

		return origin;
	}

	public void setOrigin( int abscissa, int ordinate ) {

		origin.setAbscissa( abscissa );
		origin.setOrdinate( ordinate );
	}

	/* Init & Destroy Methods */
	public void init() {

		System.out.println( "Going through Init method." );
	}

	public void destroy() {

		System.out.println( "Going through Destroy method." );
	}
}
