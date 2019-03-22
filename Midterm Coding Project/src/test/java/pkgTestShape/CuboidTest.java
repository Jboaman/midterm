package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.*;

public class CuboidTest {
	@Test
	public void constructorTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		assertTrue(c instanceof Cuboid);
	}
	@Test
	public void getterTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		assertEquals(c.getiDepth(),2);
	}
	@Test
	public void setterTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		c.setiDepth(5);
		assertEquals(c.getiDepth(),5);
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_2() {
		Cuboid c = new Cuboid(2,2,2);
		c.setiDepth(0); 
	}
	@Test(expected = IllegalArgumentException.class)
	public void setterTest_3() {
		Cuboid c = new Cuboid(2,2,2);
		c.setiDepth(-1); 
	}
	@Test
	public void areaTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		assertEquals(c.area(),24.0,0.1);
	}
	@Test
	public void volumeTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		assertEquals(c.volume(),8.0,0.1);
	}
	@Test(expected = UnsupportedOperationException.class)
	public void perimeterTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		c.perimeter(); 
	}
	@Test(expected = UnsupportedOperationException.class)
	public void compareToTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		Cuboid c2 = new Cuboid(2,2,5);
		c.compareTo(c2); 
	}
	@Test
	public void SortByAreaTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		Cuboid c2 = new Cuboid(1,1,1);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>(); 
        ar.add(c); 
        ar.add(c2);
        Collections.sort(ar, new SortByArea());
        ArrayList<Cuboid> ar2 = new ArrayList<Cuboid>(); 
        ar2.add(c2);  
        ar2.add(c);
        assertEquals(ar,ar2);
	}
	@Test
	public void SortByVolumeTest_1() {
		Cuboid c = new Cuboid(2,2,2);
		Cuboid c2 = new Cuboid(1,1,1);
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>(); 
        ar.add(c); 
        ar.add(c2);
        Collections.sort(ar, new SortByVolume());
        ArrayList<Cuboid> ar2 = new ArrayList<Cuboid>(); 
        ar2.add(c2);  
        ar2.add(c);
        assertEquals(ar,ar2);
	}

}
