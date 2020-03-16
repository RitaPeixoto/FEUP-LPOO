public class Application {
    public static void main(String[] args) {
        AreaAggregator areaagreg= new AreaAggregator();
        Shape s1 = new Circle(0.12);
        Shape s2 = new Square(6.4);
        Shape s3 = new Circle (2.1);
        Shape s4 = new Ellipse(2.1,3.4);
        Shape s5 = new Triangle(1.6,2.9);

        areaagreg.addShape(s1);
        areaagreg.addShape(s2);
        areaagreg.addShape(s3);
        areaagreg.addShape(s4);
        areaagreg.addShape(s5);

        AreaStringOutputter stringOutputter = new AreaStringOutputter(areaagreg);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(areaagreg);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());;
    }
}
