import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        AreaAggregator areaagreg= new AreaAggregator();

        areaagreg.addShape(new Square(10));
        areaagreg.addShape(new Circle(5));
        areaagreg.addShape(new Circle(2));
        areaagreg.addShape(new Ellipse(2, 3));
        areaagreg.addShape(new Rectangle(10, 5));
        areaagreg.addShape(new Triangle(10, 2));
        areaagreg.addShape(new House(100));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(areaagreg);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(areaagreg);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

        List<House> houses = new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(150));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);

        System.out.println(cityStringOutputter.output());
        System.out.println(cityXmlOutputter.output());
    }
}
