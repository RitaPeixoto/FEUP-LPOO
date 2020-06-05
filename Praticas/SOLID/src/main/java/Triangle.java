public class Triangle implements AreaShape {

    private double base;
    private double height;
    public Triangle(double base, double height ){
        super();
        this.base=base;
        this.height = height;

    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double getArea(){
        return (height/2.0)*base;
    }
    @Override
    public void draw(){
        System.out.println("Triangle");
    }


}