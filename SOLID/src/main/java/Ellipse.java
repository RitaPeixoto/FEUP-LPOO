public class Ellipse implements AreaShape {
    private double x_radius;
    private double y_radius;

    public Ellipse (double x, double y){
        this.x_radius=x;
        this.y_radius=y;
    }
    public double getX_radius() {
        return x_radius;
    }

    public void setX_radius(double x_radius) {
        this.x_radius = x_radius;
    }

    public double getY_radius() {
        return y_radius;
    }

    public void setY_radius(double y_radius) {
        this.y_radius = y_radius;
    }
    @Override
    public double getArea(){
        return Math.PI *(getX_radius())*(getY_radius());
    }
    @Override
    public void draw(){
        System.out.println("Elipse");
    }
}
