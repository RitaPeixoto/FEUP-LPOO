public class AreaXMLOutputter extends AreaAggregator {
    private SumProvider areaaggreg;
    public AreaXMLOutputter(SumProvider areaagreg){
        this.areaaggreg = areaagreg;
    }

    public SumProvider getAreaaggreg() {
        return areaaggreg;
    }

    public void setAreaaggreg(SumProvider areaaggreg) {
        this.areaaggreg = areaaggreg;
    }
    public String output(){
        return "<area>"+this.areaaggreg.sum()+"</area>";
    }
}
