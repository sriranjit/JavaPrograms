class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
public class Inheritance
{
	public static void main(String[] args) {
		Shape circ=new Circle();
		Shape rect=new Rectangle();
		circ.draw();
		rect.draw();
	}
}