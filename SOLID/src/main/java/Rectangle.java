public class Rectangle implements AreaShape {
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return width*height;
    }
    @Override
    public void draw(){
        System.out.println("Retangle");
    }
}

/*
* We still had to change the AreaAggregator class to add the new shape.
* This violates the OCP (Open/Close Principle):
* “A module should be open for extension but closed for modification.”


 * */
