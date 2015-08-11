package com.core.basics;

public class PointImpl implements Point {

	private static final double	DEFAULT_ABSCISSA = 0.0;
	private static final double	DEFAULT_ORDINATE = 0.0;

	private double abscissa;
	private double ordinate;

	/* Constructors */
	public PointImpl( double abscissa, double ordinate ) {
		this.abscissa = abscissa;
		this.ordinate = ordinate;
	}

	public PointImpl() {
		this( DEFAULT_ABSCISSA, DEFAULT_ORDINATE );
	}

	/* Mutators - Getters & Setters */
	@Override
	public double getAbscissa() {

		return abscissa;
	}

	@Override
	public void setAbscissa( double abscissa ) {

		this.abscissa = abscissa;
	}

	@Override
	public double getOrdinate() {

		return ordinate;
	}

	@Override
	public void setOrdinate( double ordinate ) {

		this.ordinate = ordinate;
	}

}
