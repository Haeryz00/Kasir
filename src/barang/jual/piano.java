package barang.jual;

import barang.item;
import barang.musik;

public class piano extends item implements musik{

    double maxDiscount = musik.max_disc;

    public piano(){
        setOnSale(Boolean.FALSE);
        setDiscount(0.3F);
        setBrand("Yamaha");
        setModel("Whehe");
        setPrice(5000000);
        setStock(5);
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
