package functional_interface;


interface ReportExporter { // interface Report

    void exportToCSV();
    void exportToPDF();

    // Newly added feature
    default void exportToJSON() {
        System.out.println("Exporting report to JSON (default implementation)");
    }
}

class SalesReport implements ReportExporter {  // class SalersReport using ReportExporter interface

    @Override
    public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}

class InventoryReport implements ReportExporter {// class InventoryReport using ReportExporter interface

    @Override
    public void exportToCSV() {
        System.out.println("Inventory report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Inventory report exported to PDF");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Inventory report exported to JSON");
    }
}




public class DataExportFeature {  // main class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ReportExporter sales = new SalesReport();
	        sales.exportToCSV();
	        sales.exportToPDF();
	        sales.exportToJSON();   // default method

	        ReportExporter inventory = new InventoryReport();
	        inventory.exportToJSON(); // overridden

	}

}
