package voucher;

import disc.orang.karyawan;
import disc.orang.pelanggan;

public class cashier {
    karyawan karyawan = new karyawan();
    pelanggan pelanggan = new pelanggan();

    float currentPrice, currentDiscount=0, total, memberDiscount;
    String name = "", memberType = "Tidak ada";

    float getTotal(){
        this.total = currentPrice - (currentPrice * currentDiscount);
        return this.total;
    }
    void setPrice(float price){this.currentPrice += price;}
    void setDisc(float disc){
        currentDiscount = Float.sum(currentDiscount,disc);
    }
    String getMemberType(){return memberType;}

    public void setName(String name) {
        this.name = name;
    }
    public float getMembershipDiscount(){
        return memberDiscount;
    }
    public void isKaryawan(){
        setDisc(karyawan.getMembershipDiscount());
        memberDiscount = karyawan.getMembershipDiscount();}
    public Boolean isMember(){
        if(pelanggan.isPelanggan(name) == Boolean.TRUE){
            this.memberType = pelanggan.getMemberType();
            setDisc(pelanggan.getMembershipDiscount());
            memberDiscount = pelanggan.getMembershipDiscount();
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }
    }
}
