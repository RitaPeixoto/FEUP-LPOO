
public class FileSystem extends Folder {
    private String type;
    private Folder root;

    public FileSystem(String type){
        this.type = type;
        this.root = new Folder();
    }

    public String getType() {
        return type;
    }

    public Folder getRoot() {
        return root;
    }

}
