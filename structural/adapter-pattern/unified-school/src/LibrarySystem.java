
public class LibrarySystem {
    private String name;

    public LibrarySystem(String name) {
        this.name = name;
    }

    public void manageBooks() {
        System.out.println("[" + name + " LibrarySystem] Managing books, loans and returns...");
        System.out.println("[" + name + " LibrarySystem] Library operations updated.");
    }
}
