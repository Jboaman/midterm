package pkgShape;

public class Rectangle extends Shape {
	public int iWidth;
	public int iLength;
	public Rectangle(int w, int l) throws IllegalArgumentException {
		setiWidth(w);
		setiLength(l);
	}
	public int getiWidth() {
		return this.iWidth;
	}
	public void setiWidth(int w) throws IllegalArgumentException{
		if(w<=0) {
			throw new IllegalArgumentException();
		}
		else{
			iWidth = w;
		}
	}
	public int getiLength() {
		return this.iLength;
	}
	public void setiLength(int l) throws IllegalArgumentException {
		if(l<=0) {
			throw new IllegalArgumentException();
		}
		else{iLength = l;
		}
	}
	public double area() {
		return (this.iWidth*this.iLength);
	}
	public double perimeter() {
		return ((this.iWidth*2)+(this.iLength*2));
	}
	public int compareTo(Object o) {
		return (int) (this.area()- ((Rectangle)o).area());
	}
}
