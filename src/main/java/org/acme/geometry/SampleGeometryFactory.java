package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class SampleGeometryFactory {
	
	public static Point createPoint0() {
		return new Point(new Coordinate(0.0, 0.0));
	}
	
	public static Point createPointA() {
		return new Point(new Coordinate(3.0, 4.0));
	}
	
	public static LineString createLineString() {
		List<Point> points = new ArrayList<>();
		points.add(createPoint0());
		points.add(createPointA());
		return new LineString(points);
	}

}
