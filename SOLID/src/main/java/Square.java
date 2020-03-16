public class Square implements Shape {
    private double side;
    public Square(double side ){
        super();
        this.side=side;

    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        return Math.pow(getSide(), 2);
    }
    public void draw(){
        System.out.println("Square");
    }
}
