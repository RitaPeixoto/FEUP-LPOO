public class AreaXMLOutputter {
    private AreaAggregator areaaggreg;
    public AreaXMLOutputter(AreaAggregator areaagreg){
        this.areaaggreg = areaagreg;
    }

    public AreaAggregator getAreaaggreg() {
        return areaaggreg;
    }

    public void setAreaaggreg(AreaAggregator areaaggreg) {
        this.areaaggreg = areaaggreg;
    }
    public String output(){
        double sum = areaaggreg.sum();
        return "<area>"+sum+"</area>";
    }
}
