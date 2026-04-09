public class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        System.out.println("[LibrarySystemAdapter] Integrating library system...");
        librarySystem.manageBooks();
        System.out.println("[LibrarySystemAdapter] Library system integrated.\n");
    }
}
