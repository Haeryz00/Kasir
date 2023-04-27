package barang.jual;

import barang.item;
import barang.musik;

public class piano<t> extends item<t> implements musik{
    public t getbrandp(){
        return getBrand();
    }

    public void setBrandp(t brand){
        setBrand(brand);
    }

    public t getModelP(){
        return getBrand();
    }

    public void setModelP(t brand){
        setBrand(brand);
    }

    public boolean getSale(){
        return getSale();
    }

    public void setSale(t sale){
        setSale(sale);
    }

    

    @Override
    public int getDiscountedPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDiscountedPrice'");
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }
}
