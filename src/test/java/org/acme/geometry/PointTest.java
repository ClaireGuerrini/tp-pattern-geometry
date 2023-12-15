package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorCoordinate(){

		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		
		Assert.assertEquals(c,p.getCoordinate());
		Assert.assertFalse(p.isEmpty());
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, p.getCoordinate().getY(), EPSILON);
		
		
	}
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertTrue(p.isEmpty());

	}
	
	@Test
	public void testGetType(){
		
		Point p = new Point();
		
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testTranslate(){
		
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		
		double dx = 2;
		double dy = 1.5;
		
		p.translate(dx, dy);
		
		Assert.assertEquals(5.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.5, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testClone(){
		
		Coordinate c = new Coordinate(3.0,4.0);
		Point p = new Point(c);
		
		Point copy = p.clone();
		copy.translate(10.0,10.0);
		
		
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, p.getCoordinate().getY(), EPSILON);
		Assert.assertEquals(13.0, copy.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(14.0, copy.getCoordinate().getY(), EPSILON);
	}
	


}