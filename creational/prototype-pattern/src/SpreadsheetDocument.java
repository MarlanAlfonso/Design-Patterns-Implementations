public class SpreadsheetDocument implements Document {
    String name;
    int rows;
    int columns;

    public SpreadsheetDocument(String name, int rows, int columns) {
        System.out.println("Creating a Spreadsheet Document prototype.");
        this.name = name;
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(this.name, this.rows, this.columns);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + name +
                " (" + rows + " rows, " + columns + " columns)");
    }

    @Override
    public String getType() {
        return "Type: Spreadsheet, Name: " + name + ", Rows: " + rows + ", Columns: " + columns;
    }
}