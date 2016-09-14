class Area{
	int length=8;
	int breadth=6;
	int base=5;
	int height=10;
}
class triRectArea extends Area{
	public int getAreaOfRectangle(){
		return length*breadth;
	}
	public int getAreaOfTriangle(){
		return (base*height)/2;
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		triRectArea rectangle = new triRectArea();
		int rect = rectangle.getAreaOfRectangle();
		
		triRectArea triangle = new triRectArea();
		int tri = triangle.getAreaOfTriangle();
		System.out.println("The area of rectangle is "+rect);
		System.out.println("The area of Triangle is "+tri);

	}

}