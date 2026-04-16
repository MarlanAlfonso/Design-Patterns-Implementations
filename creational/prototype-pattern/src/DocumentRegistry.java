public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdf() {
        return pdfPrototype.clone();
    }

    public Document createText() {
        return textPrototype.clone();
    }

    public Document createSpreadsheet() {
        return spreadsheetPrototype.clone();
    }
}