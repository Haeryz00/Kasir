package barang.jual;

import barang.elektronik;
import barang.item;

public class lampu extends item implements elektronik{
    public lampu(){
        setOnSale(Boolean.TRUE);
        setDiscount(0.5F);
        setBrand("Philip");
        setModel("RGB lamp");
        setPrice(150000);
        setStock(100);
    }

    @Override
    public void updateStock(int quantity){
        super.updateStock(quantity);
    }
}
