import java.util.Objects;

public class User {
    private String name;
    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name == ((User)obj).getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
