package org.acme.geometry;

import java.util.ArrayList;

public class Envelope {
	
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Envelope() {
		this(null,null);
	}
	
	public Envelope(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft != null ? bottomLeft : new Coordinate();
		this.topRight = topRight != null ? topRight : new Coordinate();
	}
	
	public boolean isEmpty() {
		return this.bottomLeft.isEmpty() || this.topRight.isEmpty();
	}

	public double getXmin() {
		return this.bottomLeft.getX();
	}
	
	public double getYmin() {
		return this.bottomLeft.getY();
	}
	
	public double getXmax() {
		return this.topRight.getX();
	}
	
	public double getYmax() {
		return this.topRight.getY();
	}
	
	public String toString() {
		return this.getXmin()+","+this.getYmin()+","+this.getXmax()+","+this.getYmax();
	}
}
