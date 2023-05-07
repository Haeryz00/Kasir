package barang;

public abstract class item {
    private String brand, model;
    private int price, stock;
    private float discount;
    private Boolean onSale;

    public void setBrand(String brand){this.brand = brand;}
    public String getBrand(){return brand;}

    public void setModel(String model){this.model = model;}
    public String getModel(){return model;}

    public void setPrice(int price){this.price = price;}
    public int getPrice(){
        if(getOnSale() == Boolean.TRUE){
            return (int) (this.price - (this.price * getDiscount()));
        }else {
            return this.price;
        }
    }

    public void setStock(int stock){this.stock = stock;}
    public int getStock(){return stock;}

    public void setDiscount(float discount){this.discount = discount;}
    public float getDiscount(){return discount;}

    public void setOnSale(Boolean onSale){this.onSale = onSale;}
    public Boolean getOnSale(){return onSale;}

    public void updateStock(int quantity) {
        stock -= quantity;
    }

}

