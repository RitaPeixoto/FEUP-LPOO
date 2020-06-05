
public abstract class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name) {
       this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
            if (this == o) return true;                   // are the references equal
            if (o == null) return false;                  // is the other object null
            if (getClass() != o.getClass()) return false;
        return this.getName() == ((Person)o).getName();
    }

    @Override
    public int compareTo(Object o) {
        return this.age;
    }
}
