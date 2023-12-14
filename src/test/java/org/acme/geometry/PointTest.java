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
		Assert.assertEquals(3.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(4.0, p.getCoordinate().getY(), EPSILON);
		
		
	}
	
	@Test
	public void testGetType(){
		
		Point p = new Point();
		
		Assert.assertEquals("Point", p.getType());
	}

}