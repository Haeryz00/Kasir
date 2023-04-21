package barang;

public abstract class item<T> {
    private String brand;
    private String model;
    private int price;
    private boolean onSale;
    private double discount;

    public T getBrand() {
        return (T) brand;
    }

    public void setBrand(T brand) {
        this.brand = (String) brand;
    }

    public T getModel() {
        return (T) model;
    }

    public void setModel(T model) {
        this.model = (String) model;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(T onSale) {
        this.onSale = (boolean) onSale;
    }

    public double getDiscount() {
        return discount;
    }

    public abstract double getDiscountedPrice();

    public abstract int getPrice();
}
