import javax.naming.Name;

public class FileSystem {
    private String type;
    private Folder root;
    private NameFormatter nameFormatter;

    public FileSystem(String type){
        this.type = type;
        this.root = new Folder(this);
    }

    public String getType() {
        return type;
    }

    public Folder getRoot() {
        return root;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRoot(Folder root) {
        this.root = root;
    }

    public NameFormatter getNameFormatter() {
        return nameFormatter;
    }

    public void setNameFormatter(NameFormatter nameFormatter) {
        this.nameFormatter = nameFormatter;
    }
}
