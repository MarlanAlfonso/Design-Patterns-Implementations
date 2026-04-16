public class ProcessedDocument {
    public static void main(String[] args) {

        DocumentRegistry registry = new DocumentRegistry();

        // PDF
        Document pdf = registry.createPdf();
        pdf.open();
        System.out.println(pdf.getType());
        System.out.println();

        // TEXT
        Document text = registry.createText();
        text.open();
        System.out.println(text.getType());
        System.out.println();

        // SPREADSHEET
        Document sheet = registry.createSpreadsheet();
        sheet.open();
        System.out.println(sheet.getType());
        System.out.println();

        // Another PDF (custom clone)
        Document anotherPdf = new PdfDocument("summary_report.pdf", "Acme Corp", 30);
        anotherPdf.open();
    }
}