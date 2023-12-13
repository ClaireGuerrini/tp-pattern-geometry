package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructorXY(){
		// TODO
		Coordinate c1 = new Coordinate(3.0,4.0);
		Assert.assertEquals(3.0, c1.getX(), EPSILON);
		Assert.assertEquals(4.0, c1.getY(), EPSILON);
		Assert.assertFalse(c1.isEmpty());
		Assert.assertEquals("[3.0,4.0]", c1.toString());
		
		Coordinate c2 = new Coordinate();
		Assert.assertTrue(c2.isEmpty());
		Assert.assertEquals("[NaN,NaN]", c2.toString());
		
		Coordinate c3 = new Coordinate(Double.NaN,4.0);
		Assert.assertTrue(c3.isEmpty());
		
		Coordinate c4 = new Coordinate(3.0,Double.NaN);
		Assert.assertTrue(c4.isEmpty());
	}

}
