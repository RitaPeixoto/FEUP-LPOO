import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        AreaAggregator areaagreg= new AreaAggregator();

        areaagreg.addShape(new Circle(0.12));
        areaagreg.addShape(new Square(6.4));
        areaagreg.addShape(new Circle (2.1));
        areaagreg.addShape(new Ellipse(2.1,3.4));
        areaagreg.addShape(new Triangle(1.6,2.9));

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
