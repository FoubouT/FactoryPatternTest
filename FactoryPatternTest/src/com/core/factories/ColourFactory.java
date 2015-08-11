package com.core.factories;

import com.core.colours.Colour;
import com.core.colours.Colour.Colours;
import com.core.shapes.Shape;
import com.core.shapes.Shape.Shapes;

class ColourFactory extends Factory {

	private static ColourFactory instance;

	/* Class Methods */
	@Override
	public Shape getShape( Shapes shapeType ) {

		System.out.println( "This method should not be accessed from this object. Null was returned." );
		return null;
	}

	@Override
	public Colour getColour( Colours colourChoice ) {

		switch ( colourChoice ) {
		case BLUE:
			return new Blue();
		case GREEN:
			return new Green();
		case RED:
			return new Red();
		default:
			System.out.println( "The specified colour does not exist. Null was returned." );
			return null;
		}
	}

	public static ColourFactory getInstance() {

		return ( instance == null ) ? instance : new ColourFactory();
	}

	/* Constructors */
	private ColourFactory() {
	}
}
