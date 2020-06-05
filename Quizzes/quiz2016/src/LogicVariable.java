public class LogicVariable {
    private String name;
    private Boolean value;
    private LogicGate calculatedBy;
    public LogicVariable(String name, Boolean value){
        this.name = name;
        this.value = value;
        this.calculatedBy = null;

    }
    public LogicVariable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void setValue(Boolean value){
        this.value = value;
    }


    public boolean getValue() {
        if(calculatedBy != null) calculatedBy.calculation();
        return value;
    }
    public LogicGate getCalculatedBy() {
        return calculatedBy;
    }

    public void setCalculatedBy(LogicGate calculatedBy) {
        this.calculatedBy = calculatedBy;
    }
    public String getFormula(){
        String res;
        if(calculatedBy == null) return name;

        res = calculatedBy.getSymbol() + "(";
        for(LogicVariable in: calculatedBy.getInputs())
            res += in.getFormula() + ",";

        res = res.substring(0,res.length()-1);
        res += ")";
        return  res;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((LogicVariable)obj).getName();
    }
}
