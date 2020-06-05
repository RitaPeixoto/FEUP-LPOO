import java.util.HashSet;
import java.util.Set;

public class CombinatorialCircuit {
    private Set<LogicVariable> variables;

    public CombinatorialCircuit(){
        this.variables = new HashSet<>();
    }
    public boolean addVariable(LogicVariable var) {
        return variables.add(var);
    }
    public LogicVariable getVariableByName(String name){
        for(LogicVariable var: variables){
            if(var.getName() == name)
                return var;
        }
        return null;
    }

}
