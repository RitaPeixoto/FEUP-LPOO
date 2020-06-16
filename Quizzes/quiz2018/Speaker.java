public class Speaker extends User {
    private int fee = 0;
    public Speaker(String name, int age) {
        super(name,age);
    }
    public Speaker(String name){ super(name);}
    public int getFee() {
        return fee;
    }
}
