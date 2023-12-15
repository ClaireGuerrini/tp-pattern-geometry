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
		
		Assert.assertFalse(ls.isEmpty());
		Assert.assertEquals(2,ls.getNumPoints());
		Assert.assertEquals(p1,ls.getPointN(0));
		Assert.assertEquals(p2,ls.getPointN(1));

		
		
	}
	
	@Test
	public void testDefaultConstructor(){
		LineString ls = new LineString();
		Assert.assertTrue(ls.isEmpty());
		Assert.assertEquals(0,ls.getNumPoints());
	}
	
	@Test
	public void testGetType(){
		
		LineString ls = new LineString();
		
		Assert.assertEquals("LineString", ls.getType());
	}
	
	@Test
	public void testTranslate(){
		
		Coordinate c1 = new Coordinate(3.0,4.0);
		Point p1 = new Point(c1);
		
		Coordinate c2 = new Coordinate(5.5,7.4);
		Point p2 = new Point(c2);

		List<Point> points = new ArrayList<>();
		points.add(p1);
		points.add(p2);
		
		LineString ls = new LineString(points);
		
		double dx = 2;
		double dy = 1.5;
		
		ls.translate(dx, dy);
		
		Assert.assertEquals(5.0, ls.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.5, ls.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(7.5, ls.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(8.9, ls.getPointN(1).getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testClone(){
		
		Coordinate c1 = new Coordinate(3.0,4.0);
		Point p1 = new Point(c1);
		
		Coordinate c2 = new Coordinate(6.0,7.0);
		Point p2 = new Point(c2);

		List<Point> points = new ArrayList<>();
		points.add(p1);
		points.add(p2);
		
		LineString ls = new LineString(points);
		
		LineString lsCopy = ls.clone();
		
		lsCopy.translate(10.0, 10.0);
		
		Assert.assertEquals(2,lsCopy.getNumPoints());
		Assert.assertEquals(3.0, ls.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(6.0, ls.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(13.0, lsCopy.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(16.0, lsCopy.getPointN(1).getCoordinate().getX(), EPSILON);
	}
}
