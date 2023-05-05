package disc.orang;

import disc.memership;
import disc.person;

public class karyawan extends person implements memership{
    float discount = 0.125F;

    @Override
    public float getMembershipDiscount() {
        return discount;
    }
}
