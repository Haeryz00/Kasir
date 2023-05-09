package barang.jual;

import barang.item;
import barang.musik;

public class piano extends item implements musik{

    double maxDiscount = musik.max_disc;

    public piano(){
        setOnSale(Boolean.FALSE);
        setBrand("Yamaha");
        setModel("Whehe");
        setPrice(5000000);
        setStock(5);

        double discount = 0.13F;
        if (maxDiscount > 0.15 && discount > 0.15){
            discount = 0.15;
        } else if (maxDiscount <= 0.15 && discount > maxDiscount){
            discount = maxDiscount;
        }

        setDiscount((float)discount);
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
