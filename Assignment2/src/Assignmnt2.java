
class Shape
{
	public void getArea(int r)
	{
		System.out.println("Area of Shape: " +r);
	}

	public void getShape() {
		
		System.out.println("Shape of Circle &");
		System.out.println("Shape of Square is:");
	}
	
}

class Circle extends Shape
{
	double Areaofcircle;
	public void getArea(int r)
	{
		Areaofcircle=2*3.14*r;
	}
	public void getShape()
	{
		System.out.println(Areaofcircle);
	}
}
class Square extends Shape
{
	double AreaofSquare;
	public void getArea(int r)
	{
		AreaofSquare=r*r;
	}
	public void getShape()
	{
		System.out.println(AreaofSquare);
	}
}
public class Assignmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape S;
		S=new Shape();
		S.getArea(5);
		S.getShape();
		
		S=new Circle();
		S.getArea(10);
		S.getShape();
		
		S=new Square();
		S.getArea(15);
		S.getShape();
		
		
		
		

	}

}

