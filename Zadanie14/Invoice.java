package zadanie;

public class Invoice {
    private String product_number;
    private String product_description;
    private int quantity;
    private double pricePerItem;

    Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        this.product_number = product_number;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getProduct_number() {
        return product_number;
    }
    public String getProduct_description() {
        return product_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getPricePerItem() {
        return String.valueOf(pricePerItem);
    }
    public String amount() {
        if (quantity <= 0 || pricePerItem <= 0) {
            return "0";
        } else {
            return String.valueOf(quantity * pricePerItem);
        }
    }
}
