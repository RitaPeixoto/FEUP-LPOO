public class StringCaseChanger implements StringTransformer {
    private String text;
    public StringCaseChanger(String text){
        this.text = text;
    }
    public StringCaseChanger(){
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void execute(StringDrink drink){
        String caseCh = drink.getText();
        char[] aux = caseCh.toCharArray();
        for(int i=0; i<aux.length;i++){
            if(Character.isUpperCase(aux[i])){
                aux[i]=Character.toLowerCase(aux[i]);
            }
            else{
                aux[i]=Character.toUpperCase(aux[i]);
            }
        }
        caseCh = new String(aux);
        drink.setText(caseCh);
    }
    public void undo (StringDrink drink){
        String caseCha = drink.getText();
        char[] aux = caseCha.toCharArray();
        for(int i=0; i<aux.length;i++){
            if(Character.isUpperCase(aux[i])){
                aux[i]=Character.toLowerCase(aux[i]);
            }
            else{
                aux[i]=Character.toUpperCase(aux[i]);
            }
        }
        caseCha = new String(aux);
        drink.setText(caseCha);
    }
}
