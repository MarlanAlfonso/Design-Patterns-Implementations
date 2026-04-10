import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<LibraryResource> borrowedResources;

    public Student(String name) {
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    public void borrow(LibraryResource resource) {
        resource.borrow();
        borrowedResources.add(resource);
    }

    public void showBorrowedResources() {
        System.out.println("\n" + name + "'s Borrowed Resources:");
        for (LibraryResource resource : borrowedResources) {
            System.out.println("- " + resource.getTitle());
        }
    }
}