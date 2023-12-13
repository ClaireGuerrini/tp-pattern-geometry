package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorXY(){

		Coordinate c = new Coordinate(3.0,4.0);
		Assert.assertEquals(3.0, c.getX(), EPSILON);
		Assert.assertEquals(4.0, c.getY(), EPSILON);
		Assert.assertFalse(c.isEmpty());
		Assert.assertEquals("[3.0,4.0]", c.toString());
		
	}
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertTrue(c.isEmpty());
		Assert.assertEquals("[NaN,NaN]", c.toString());
	}
	
	@Test
	public void testHalfEmpty(){
		Coordinate c1 = new Coordinate(Double.NaN,4.0);
		Assert.assertTrue(c1.isEmpty());
		
		Coordinate c2 = new Coordinate(3.0,Double.NaN);
		Assert.assertTrue(c2.isEmpty());
	}

}
