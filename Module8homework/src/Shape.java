public class Shape {
    public String figure(){
        return "Shape";
    }
    
}
class AutShape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape rhombus = new Rhombus();
        Shape rectangle = new Rectangle();
        Shape cone = new Cone();

        System.out.println( "Circle = " + circle.figure());
        System.out.println("quad = " + quad.figure());
        System.out.println("rhombus = " + rhombus.figure());
        System.out.println("rectangle = " + rectangle.figure());
        System.out.println("cone = " + cone.figure());
    }
}


