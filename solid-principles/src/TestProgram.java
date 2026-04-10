public class TestProgram {
    public static void main(String[] args) {

        Student student = new Student("Juan");

        LibraryResource book = new Book("Java Programming");
        LibraryResource journal = new Journal("AI Research");
        LibraryResource thesis = new Thesis("Machine Learning Thesis");

        student.borrow(book);
        student.borrow(journal);
        student.borrow(thesis);

        student.showBorrowedResources();
    }
}