public interface Shape {

    void calculateArea(int radius);
    void calculatePerimeter(int radius);
}
class Circle implements Shape{
    @Override
    public void calculateArea(int radius) {
        System.out.println("The area of the circle with radius "+radius+" is "+(radius*radius)*3.14159);
    }

    @Override
    public void calculatePerimeter(int radius) {
        System.out.println("The perimeter of the circle with radius "+radius+" is "+(radius*3.14159)*2);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(int side) {
        System.out.println("The area of the square with side "+side+" is "+side*side);
    }

    @Override
    public void calculatePerimeter(int side) {
        System.out.println("The perimeter of the square with side "+side+" is "+side*4);
    }
}
class shapeTester{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea(10);
        c.calculatePerimeter(10);
        Square s=new Square();
        s.calculateArea(10);
        s.calculatePerimeter(10);
    }
}
