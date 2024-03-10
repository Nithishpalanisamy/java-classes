class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(0, quantity);
        this.pricePerItem = Math.max(0.0, pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = Math.max(0, quantity);
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = Math.max(0.0, pricePerItem);
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}
public class invoiceMain {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 2, 14.95);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
