

interface Shape {
    
    abstract double area();
    abstract double perimeter(); 

    default void shapeName(){
        System.out.println("Shape: ");
    }
}

class Circle implements Shape {
    public int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return (double)(Math.PI * (Math.pow(radius, 2)));
    }

    @Override
    public double perimeter(){
        return (double)(2 * Math.PI * radius);
    }

    @Override
    public void shapeName(){
        System.out.println("Shape: Circle");
    }
}

class Rectangle implements Shape{
    int l,w;

    Rectangle(int l, int w){
        this.l = l;
        this.w = w; 
    }

    @Override
    public double area(){
        return (double) (l * w);
    }

    @Override
    public double perimeter(){
        return (double)(2 * (l + w));
    }

    @Override
    public void shapeName(){
        System.out.println("Shape: Rectangle");
    }
}

public class InterfacesShape {

    public static void main(String[] args) {
        
        Shape s1 = new Circle(4);
        
        s1.shapeName();
        System.out.println("Area: " + s1.area() + " Perimeter: " + s1.perimeter());

        Shape s2 = new Rectangle(4,5);

        s1.shapeName();
        System.out.println("Area: " + s2.area() + " Perimeter: " + s2.perimeter());
        

    }
}