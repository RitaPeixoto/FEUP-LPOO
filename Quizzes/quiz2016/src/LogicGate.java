public abstract class LogicGate {
    private LogicVariable output;
    private LogicVariable[] inputs;

    public LogicGate(LogicVariable output, LogicVariable input1, LogicVariable input2)throws CycleException, ColisionException{
        if(output.getCalculatedBy() != null) throw new ColisionException();
        if(input1.getCalculatedBy() != null)
            if(input1.getCalculatedBy().inputsContains(output))
                throw new CycleException();
        if(input2.getCalculatedBy() != null)
            if(input2.getCalculatedBy().inputsContains(output))
                throw new CycleException();
        this.output = output;
        this.inputs = new LogicVariable[]{input1, input2};
        this.output.setCalculatedBy(this);
    }

    public LogicGate(LogicVariable output, LogicVariable input) throws CycleException, ColisionException{
        if(output.getCalculatedBy() != null) throw new ColisionException();
        if(input.getCalculatedBy() != null)
            if(input.getCalculatedBy().inputsContains(output))
                throw new CycleException();
        this.output = output;
        this.output.setCalculatedBy(this);
        this.inputs = new LogicVariable[]{input};
    }
    public void setOutputValue(Boolean outputValue){
        this.output.setValue(outputValue);
    }

    public LogicVariable[] getInputs() {
        return inputs;
    }

    public LogicVariable getOutput() {
        return output;
    }
    public abstract String getSymbol();

    public abstract void calculation();

    public String getFormula(){
        return output.getFormula();
    }

    private boolean inputsContains(LogicVariable var){
        for(LogicVariable v : inputs){
            if(v.equals(var)) return true;
        }
        return false;
    }
}
