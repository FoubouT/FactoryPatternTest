package com.main;

import com.core.colours.Blue;
import com.core.colours.Colour;
import com.core.colours.Colour.Colours;
import com.core.factories.Factory;
import com.core.factories.Factory.Factories;
import com.core.shapes.Shape;
import com.core.shapes.Shape.Shapes;
import com.core.shapes.ShapeFactory;

public class App {

	public static void main( String[] args ) {

		Factory myFactory = Factory.getFactory( Factories.SHAPE );
		Shape myShape = myFactory.getShape( Shapes.TRIANGLE );
		myShape.draw();

		myFactory = Factory.getFactory( Factories.COLOUR );
		Colour myColour = myFactory.getColour( Colours.RED );
		myColour.fill();

		// Should not be possible to access this class directly, should go through Factory class only as above.
		ShapeFactory sf = ShapeFactory.getInstance();

		// Should not be possible to access this class directly, should go through Colour class only as above.
		Blue b = new Blue();
	}

}
