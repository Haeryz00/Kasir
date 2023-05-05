package barang.jual;

import barang.item;
import barang.musik;

public class piano extends item implements musik{
    piano(){
        setOnSale(Boolean.FALSE);
        setDiscount(0.3F);
        setBrand("Yamaha");
        setModel("Whehe");
        setPrice(5000000);
        setStock(5);
    }
}
