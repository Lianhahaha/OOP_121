public class Studentt {
    private String name;
    private int id;

    public Studentt(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
