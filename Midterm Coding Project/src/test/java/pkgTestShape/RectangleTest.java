package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.*;

import pkgShape.Rectangle;

public class RectangleTest {
	
	@Test
	public void constructorTest_1() {
		Rectangle n = new Rectangle(2,2);
		assertTrue(n instanceof Rectangle);
	}
	
	@Test
	public void getterTest_1() {
		Rectangle n = new Rectangle(2,3);
		assertEquals(n.getiWidth(), 2);
	}
	@Test
	public void getterTest_2() {
		Rectangle n = new Rectangle(2,3);
		assertEquals(n.getiLength(), 3);
	}
	@Test
	public void setterTest_1() {
		Rectangle n = new Rectangle(2,3);
		n.setiWidth(5);
		assertEquals(n.getiWidth(), 5);
	}
	
	@Test
	public void setterTest_2() {
		Rectangle n = new Rectangle(2,3);
		n.setiLength(5);
		assertEquals(n.getiLength(), 5);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_3() {
	    Rectangle n = new Rectangle(2,3);
	    n.setiLength(-1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_4() {
	    Rectangle n = new Rectangle(2,3);
	    n.setiWidth(0);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_5() {
	    Rectangle n = new Rectangle(2,3);
	    n.setiWidth(-1);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_6() {
	    Rectangle n = new Rectangle(2,3);
	    n.setiLength(0);
	}
	@Test
	public void areaTest_1() {
		Rectangle n = new Rectangle(2,3);
		assertEquals(n.area(), 6.0, 0.1);
	}
	@Test
	public void perimeterTest_1() {
		Rectangle n = new Rectangle(2,3);
		assertEquals(n.perimeter(), 10.0, 0.1);
	}
	@Test
	public void compareToTest_1() {
		Rectangle n = new Rectangle(2,3);
		Rectangle n2 = new Rectangle(3,3);
		assertEquals(n.compareTo(n2), -3.0,0.1);
	}

}
