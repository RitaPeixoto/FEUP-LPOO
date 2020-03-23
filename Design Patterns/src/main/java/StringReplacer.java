public class StringReplacer implements StringTransformer {
    private Character old, new_s;

    public StringReplacer(Character old, Character new_s){
        this.old = old;
        this.new_s = new_s;
    }

    public Character getOld() {
        return old;
    }

    public void setOld(Character old) {
        this.old = old;
    }

    public Character getNew_s() {
        return new_s;
    }

    public void setNew_s(Character new_s) {
        this.new_s = new_s;
    }
    public void execute(StringDrink drink){
        String text = drink.getText();
        drink.setText(text.replace(old, new_s));
    }

    public void undo (StringDrink drink){
        String text = drink.getText();
        drink.setText(text.replace(new_s, old));
    }

}
