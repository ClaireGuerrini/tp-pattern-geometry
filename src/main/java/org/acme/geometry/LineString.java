package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {

	private List<Point> points;
	
	public LineString() {
		this(null);
	}
	
	public LineString(List<Point> points) {
		this.points = points != null ? points : new ArrayList<>();
	}
	
	@Override
	public String getType() {
		return "LineString";
	}
	
	@Override
	public boolean isEmpty() {
		return this.points.isEmpty();
	}
	
	@Override
	public void translate(double dx, double dy) {		
		for (Point point : points) {
			point.translate(dx, dy);
		}
	}
	
	@Override
	public LineString clone(){
		
		List<Point> pointsCopy = new ArrayList<>();
		for (Point point : points) {
			pointsCopy.add(point.clone());
		}
		return new LineString(pointsCopy);
	}
	
	public int getNumPoints() {	
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}

	

}
