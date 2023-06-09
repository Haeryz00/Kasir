package barang.jual;

import barang.elektronik;
import barang.item;

public class lampu extends item implements elektronik {
    double maxx_disc = elektronik.max_disc;

    public lampu() {
        setOnSale(Boolean.TRUE);
        setBrand("Philip");
        setModel("RGB lamp");
        setPrice(150000);
        setStock(100);

        // Check the maximum discount allowed by elektronik interface and apply the discount accordingly
        double discount = 0.15F; // default discount
        if (maxx_disc > 0.2 && discount > 0.2) {
            discount = 0.2;
        } else if (maxx_disc <= 0.2 && discount > maxx_disc) {
            discount = maxx_disc;
        }
        setDiscount((float) discount); // cast the discount to a float before passing it to setDiscount method
    }

    @Override
    public void updateStock(int quantity) {
        if (quantity > getStock()) {
            System.out.println("Insufficient stock!");
        } else {
            setStock(getStock() - quantity);
            System.out.println(quantity + " " + getModel() + " " + getBrand() + " purchased!");
            System.out.println("New stock: " + getStock());
        }
    }
}
