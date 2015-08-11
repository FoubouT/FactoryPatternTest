package com.core.shapes;

import com.core.colours.Colour;
import com.core.colours.Colour.Colours;
import com.core.factories.Factory;
import com.core.shapes.Shape.Shapes;

// This class should be in factories package and be limited to the package visibility because it should not be instantiated on its own. 
// However, if in package factories, the shape classes need to be set public and can then be instantiated by the client (App).
public class ShapeFactory extends Factory {

	private static ShapeFactory instance;

	/* Class Methods */
	@Override
	public Shape getShape( Shapes shapeType ) {

		switch ( shapeType ) {
		case CIRCLE:
			return new Circle();
		case RECTANGLE:
			return new Rectangle();
		case SQUARE:
			return new Square();
		case TRIANGLE:
			return new Triangle();
		default:
			// Should throw a custom exception.
			System.out.println( "The specified shape does not exist. Null was returned." );
			return null;
		}
	}

	// This method should not have to be implemented here so it is not accessible if this class is instantiated.
	@Override
	public Colour getColour( Colours colourChoice ) {

		System.out.println( "This method should not be accessed from this object. Null was returned." );
		return null;
	}

	public static ShapeFactory getInstance() {

		if ( instance == null ) {
			return new ShapeFactory();
		}
		return instance;
	}

	/* Constructors */
	private ShapeFactory() {
	}
}
