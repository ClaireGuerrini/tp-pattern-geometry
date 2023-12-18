package org.acme.geometry;


public class Point implements Geometry {
	
	private Coordinate coordinate;
	
	public Point() {
		this(null);
	}
	
	public Point(Coordinate coordinate) {
		this.coordinate = coordinate != null ? coordinate : new Coordinate();
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
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
	
	@Override
	public Point clone(){
		return new Point(coordinate);
	}

	
	@Override
	public Envelope getEnvelope() {
		
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(coordinate);
		return builder.build();
	}

	
}
