public class GateOr extends LogicGate {
    private final String symbol;
    public GateOr(LogicVariable output, LogicVariable input1, LogicVariable input2) throws CycleException, ColisionException{
        super(output, input1, input2);
        this.symbol = "OR";
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void calculation() {
        LogicVariable in1 = getInputs()[0];
        LogicVariable in2 = getInputs()[1];
        setOutputValue(in1.getValue() ||in2.getValue());
    }
}
