package com.core.factories;

import com.core.colours.Colour;
import com.core.colours.Colour.Colours;
import com.core.shapes.Shape;
import com.core.shapes.Shape.Shapes;

public abstract class Factory {

	/* Enumerations */
	public enum Factories {
		COLOUR, SHAPE
	}

	/* Abstract Methods */
	public abstract Shape getShape( Shapes shapeType );

	public abstract Colour getColour( Colours colourChoice );

	/* Class Methods */
	public static Factory getFactory( Factories factoryType ) {

		switch ( factoryType ) {
		case COLOUR:
			return ColourFactory.getInstance();
		case SHAPE:
			return ShapeFactory.getInstance();
		default:
			// Should throw a custom exception.
			System.out.println( "The specified factory does not exist. Null was returned." );
			return null;
		}
	}
}
