public abstract class Node {
    private Folder parent;
    private String name;

    public Node(Folder parent,String name) {
        this.parent = parent;
        this.name = name;
    }

    public Folder getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }
}
