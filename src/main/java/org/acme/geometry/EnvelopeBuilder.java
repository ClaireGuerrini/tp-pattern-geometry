package org.acme.geometry;

public class EnvelopeBuilder {

	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public EnvelopeBuilder(){
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();

	}
	
	public void insert(Coordinate coordinate) {
		
		if (this.bottomLeft.isEmpty()) {
			this.bottomLeft = coordinate;
			this.topRight = coordinate;
			
		} else {
			double xmin = this.bottomLeft.getX();
			double ymin = this.bottomLeft.getY();
			double xmax = this.topRight.getX();
			double ymax = this.topRight.getY();
			
			if (coordinate.getX() < xmin) {
				xmin = coordinate.getX();
			}
			if (coordinate.getX() > xmax) {
				xmax = coordinate.getX();	
			}
			if (coordinate.getY() < ymin) {
				ymin = coordinate.getY();
			}
			if (coordinate.getY() > ymax) {
				ymax = coordinate.getY();	
			}
			
			this.bottomLeft = new Coordinate(xmin, ymin);
			this.topRight = new Coordinate(xmax, ymax);
		}
			
		
	}
	
	public Envelope build() {
		return new Envelope(bottomLeft,topRight);
	}
	
}
