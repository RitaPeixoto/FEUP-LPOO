public class GateNot extends LogicGate{
    private final String symbol;
    public GateNot(LogicVariable output, LogicVariable input1) throws CycleException, ColisionException{
        super(output, input1);
        this.symbol = "NOT";
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public void calculation() {
        LogicVariable in = getInputs()[0];
        setOutputValue(!in.getValue());
    }
}
