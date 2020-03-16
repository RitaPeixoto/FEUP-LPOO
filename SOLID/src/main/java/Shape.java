public interface Shape extends BasicShape {
    double getArea();
    //void draw();
}

/*
* Adding the draw method here we realize that our AreaAggregator class now depends on something that knows how to draw itself without really needing to,
* violating the ISP (Interface Segregation Principle):
* Many client specific interfaces are better than one general purpose interface.
* */
