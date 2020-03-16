public class Line implements BasicShape{
    private double length;
    public Line(double length){
        super();
        this.length = length;

    }
    public double getRadius(){
        return length;
    }
    public void setRadius(double length){
        this.length = length;
    }


}

/* If we try to create a Line implementing a Shape this would violate the LSP (Liskov Substitution Principle) as you cannot trust Shapes to have an area.
You would have to catch this exception inside the AreaAgreggator class:

“Subclasses should be substitutable for their base classes.”*/

/* After making Line implement BasicShape now, we don’t have to worry about a shape throwing a NoAreaException inside the AreaAggregator, as there is no risk that a Line will be found when iterating through all the Shapes. This happens because we can’t even add a Line to the AreaAggregator.
* */
