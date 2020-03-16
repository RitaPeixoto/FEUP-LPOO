public class Circle implements Shape {
    private double radius;
    public Circle(double radius){
        super();
        this.radius = radius;

    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }
    public void draw(){
        System.out.println("Circle");
    }

}
