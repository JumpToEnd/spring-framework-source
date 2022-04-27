package top.jzhp;

public class JzhpTest {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "JzhpTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
