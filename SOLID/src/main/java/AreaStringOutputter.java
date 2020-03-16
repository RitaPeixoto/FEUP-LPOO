public class AreaStringOutputter extends AreaAggregator{
    private SumProvider areaaggreg;
    public AreaStringOutputter(SumProvider areaagreg){
        this.areaaggreg = areaagreg;
    }

    public SumProvider getAreaaggreg() {
        return areaaggreg;
    }

    public void setAreaaggreg(SumProvider areaaggreg) {
        this.areaaggreg = areaaggreg;
    }
    public String output(){
        return "Sum of areas: " + this.areaaggreg.sum();
    }
}


