public class AreaStringOutputter {
    private AreaAggregator areaaggreg;
    public AreaStringOutputter(AreaAggregator areaagreg){
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
        return "Sum of areas: " + sum;
    }
}


