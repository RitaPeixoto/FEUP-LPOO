public class StringInverter implements StringTransformer{
    private String text;
    public StringInverter(String text){
        this.text = text;
    }
    public StringInverter(){
        this.text = "";
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void execute(StringDrink drink){
        StringBuffer aux = new StringBuffer(drink.getText());
        aux.reverse();
        drink.setText(aux.toString());
    }
    public void undo(StringDrink drink){
        StringBuffer aux = new StringBuffer(drink.getText());
        aux.reverse();
        drink.setText(aux.toString());
    }
}
