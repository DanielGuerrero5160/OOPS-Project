public interface Shape {

    void calculateArea(int radius);
    void calculatePerimeter(int radius);
}
class Circle implements Shape{
    @Override
    public void calculateArea(int radius) {
        System.out.println("The area of the circle is "+(radius*radius)*3.14159);
    }

    @Override
    public void calculatePerimeter(int radius) {
        System.out.println("The perimeter if the circle is "+(radius*3.14159)*2);
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(int side) {
        System.out.println("The area of the square is "+side*side);
    }

    @Override
    public void calculatePerimeter(int side) {
        System.out.println("The perimeter if the square is "+side*4);
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
