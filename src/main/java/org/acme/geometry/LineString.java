package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
	
	public int getNumPoints() {	
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}

}
