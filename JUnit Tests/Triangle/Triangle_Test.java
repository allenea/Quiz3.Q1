package Triangle;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Triangle_Test {
	Triangle t;
	Triangle r;
	Triangle k;
	
	@Before
	public void setUp() throws Exception {
		t = new Triangle(3, 4, 5);
		r = new Triangle(10,8,14);
		k = new Triangle(0,0,1);
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}
	
	
	@Test
	public final void testGetArea() {
		assertEquals("Area expected sqrt 36 == 6",(long)t.getArea(),(long)6);
		assertEquals("Area expected sqrt 1536 == 39.19",(long)r.getArea(),(long)39.19);
		assertEquals("Area expected sqrt 0 == 0",(long)k.getArea(),(long)0);

	}
	@Test
	public final void testGetPerimeter() {
		assertEquals("Expected 12",(long)t.getPerimeter(),(long)12);
		assertEquals("Expected 32",(long)r.getPerimeter(),(long)32);
		assertEquals("Expected 0",(long)k.getPerimeter(),(long)1);
	}

}
