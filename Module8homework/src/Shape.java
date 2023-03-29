
public abstract class Shape {
    String name = "Shape";
    public String figure(){
        return name;
    }
    public String getName() {
        return name;
    }
}
 class AutShape  {
    public void autFigure(Shape shape){
        System.out.println(shape.getName());
    }
}



