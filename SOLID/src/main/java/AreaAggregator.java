import java.util.ArrayList;
import java.util.List;

public class AreaAggregator implements SumProvider  {
    private List<HasArea> shapes = new ArrayList<>();

    public void addShape(HasArea shape) {
        shapes.add(shape);
    }

    @Override
    public double sum() {
        double sum = 0;
        for (HasArea shape: shapes) {
           sum += shape.getArea();
        }
        return sum;
    }

    /*public String output() {
        return "Sum of areas: " + sum();
    }*/
   /* public String ouputXML(){//2nd change of Area Aggregator
            return "<area>"+sum()+"</area>";
    }*/
}
/*
* The two changes to area Aggregator are a violation to SRP(Single Responsibility Principle):“Each software module should have one and only one reason to change.”
* */