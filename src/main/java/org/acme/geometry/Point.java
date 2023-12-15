package org.acme.geometry;

import java.util.Objects;

public class Point implements Geometry {
	
	private Coordinate coordinate;
	
	public Point() {
		this(null);
	}
	
	public Point(Coordinate coordinate) {
		this.coordinate = coordinate != null ? coordinate : new Coordinate();
	}
	
	@Override
	public String getType() {
		return "Point";
	}

	@Override
	public boolean isEmpty() {
		return this.coordinate.isEmpty();
	}
	
	@Override
	public void translate(double dx, double dy) {
		double newX = this.coordinate.getX() + dx;
		double newY = this.coordinate.getY() + dy;
		
		this.coordinate = new Coordinate(newX, newY);
	}

	public Coordinate getCoordinate() {
		return this.coordinate;
	}

	
}
