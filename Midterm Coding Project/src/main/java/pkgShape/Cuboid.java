package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	public int iDepth;
	public Cuboid(int w, int l, int d) throws IllegalArgumentException{
		super(w,l);
		this.iDepth = d;
	}
	public int getiDepth() {
		return this.iDepth;
	}
	public void setiDepth(int d) throws IllegalArgumentException{
		if(d<=0) {
			throw new IllegalArgumentException();
		}
		else{
			iDepth = d;
		}
	}
	public double volume() {
		return (this.iDepth*this.iLength*this.iWidth);
	}
	@Override
	public double area() {
		return ((2*this.iDepth*this.iWidth)+(2*this.iDepth*this.iLength)+(2*this.iWidth*this.iLength));
	}
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();	
	}
	
	public static class SortByArea implements Comparator<Cuboid> {
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.area()-c2.area());
		}
	}
	
	public static class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) (c1.volume()-c2.volume());
		}
	}

	
	@Override
	public int compareTo(Object o) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	

}
