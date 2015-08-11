package com.core.colours;

public abstract class Colour {

	protected int intensity;
	protected int transparency;

	/* Enumerations */
	public enum Colours {
		BLUE, GREEN, RED
	}

	/* Class Methods */
	public void fill() {

		System.out.println( "Filling item with " + getClass().getSimpleName() );
	}

	/* Abstract Methods */

	/* Mutator - Getters & Setters */
	public int getIntensity() {

		return intensity;
	}

	public void setIntensity( int intensity ) {

		this.intensity = intensity;
	}

	public int getTransparency() {

		return transparency;
	}

	public void setTransparency( int transparency ) {

		this.transparency = transparency;
	}
}
