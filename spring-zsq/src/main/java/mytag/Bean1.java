package mytag;

public class Bean1 {
    public String id;
    public String name;

    public Bean1() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
