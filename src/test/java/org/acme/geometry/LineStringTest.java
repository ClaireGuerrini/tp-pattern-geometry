package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorPoints(){
		
		Coordinate c1 = new Coordinate(3.0,4.0);
		Point p1 = new Point(c1);
		
		Coordinate c2 = new Coordinate(5.5,7.4);
		Point p2 = new Point(c2);

		List<Point> points = new ArrayList<>();
		points.add(p1);
		points.add(p2);
		
		
		LineString ls = new LineString(points);
		
		Assert.assertEquals(2,ls.getNumPoints());
		Assert.assertEquals(p1,ls.getPointN(0));
		Assert.assertEquals(p2,ls.getPointN(1));

		
		
	}
	
	@Test
	public void testGetType(){
		
		LineString ls = new LineString();
		
		Assert.assertEquals("LineString", ls.getType());
	}
}
