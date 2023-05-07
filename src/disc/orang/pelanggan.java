package disc.orang;

import java.util.Objects;
import disc.memership;
import disc.person;

public class pelanggan extends person implements memership{
    String memberType;
    String[][] pelanggan = {{"Rusdi","Fuad","Eleanor"}, {"Premium","Gold","Silver"}};

    public Boolean isPelanggan(String namer) {
        for (int i = 0; i < pelanggan[0].length; i++) {
            if (Objects.equals(pelanggan[0][i], namer)) {
                this.memberType = pelanggan[1][i];
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public float getMembershipDiscount() {
        switch (memberType) {
            case "Premium" -> {
                return 0.1F;
            }
            case "Gold" -> {
                return 0.075F;
            }
            case "Silver" -> {
                return 0.05F;
            }
            default -> {
                return 0;
            }
        }
    }
}
