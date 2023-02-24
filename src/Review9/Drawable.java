package Review9;

//collection of public static final variables and public abstract methods
//no constructors
//variables are constant.
public interface Drawable {

    //String tool;-cannot have variables unless they are assigned a variable
    //then they will be final/constants
    String TOOL="pencil";//this is ok because we are declaring a constant
//good practice to have constants in all uppercase
    void draw();

default void print(){
    System.out.println("we are drawing object using "+TOOL);
}
static void erase(){
    System.out.println("All drawings are erasable");
}
 abstract class Shape{

    String color;
    double width;
    double length;

    Shape(String color,double width,double length){
        this.color=color;
        this.width=width;
        this.length=length;
    }

   public abstract double calculateArea();

}

}
class Rectangle extends Drawable.Shape implements Drawable{
    @Override
    public double calculateArea() {
        return length*width;
    }

    public Rectangle(String color, double width, double length) {
        super(color, width, length);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Square implements Drawable{

    @Override
    public void draw() {
        System.out.println("drawing a square");
    }
}
