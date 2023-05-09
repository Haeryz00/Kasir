package barang.jual;

import barang.elektronik;
import barang.item;

public class lampu extends item implements elektronik{
    double maxx_disc = elektronik.max_disc;

    public lampu(){
        setOnSale(Boolean.TRUE);
        setDiscount(0.18F);
        setBrand("Philip");
        setModel("RGB lamp");
        setPrice(150000);
        setStock(100);
    }

    @Override
    public void updateStock(int quantity){
        if(quantity > getStock()) {
            System.out.println("Insufficient stock!");
        } else {
            setStock(getStock() - quantity);
            System.out.println(quantity + " " + getModel() + " " + getBrand() + " purchased!");
            System.out.println("New stock: " + getStock());
        }
    }
}
