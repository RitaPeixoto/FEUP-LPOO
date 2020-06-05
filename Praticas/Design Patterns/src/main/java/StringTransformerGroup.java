import java.util.List;

public class StringTransformerGroup implements  StringTransformer{
    private List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformers = transformers;
    }

    public List<StringTransformer> getTransformers() {
        return transformers;
    }

    public void setTransformers(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
    public void execute (StringDrink drink){
        for (int i =0; i<transformers.size();i++){
            transformers.get(i).execute(drink);
        }
    }
    public void undo(StringDrink drink){
        for (int i =0; i<transformers.size();i++){
            transformers.get(i).undo(drink);
        }
    }
}
