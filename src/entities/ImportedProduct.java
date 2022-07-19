package entities;

public class ImportedProduct extends Product {

    private Double customsFee; // Taxa Alfandegária

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return super.getPrice() + customsFee;
    }
    
    @Override
    public final String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getName() + " $ " + String.format("%.2f", totalPrice()));
        sb.append(" (Customs fee: $ " + customsFee + ")");
        return sb.toString();
    }

    
}
