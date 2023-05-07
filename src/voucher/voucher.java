package voucher;
import java.text.*;
import java.util.*;

public class voucher {
    private String[] code = {"YESUS", "HAMBAYESUS"};
    private Calendar kalender = Calendar.getInstance();
    float[] discount = {0.5F,0.15F};

    public float getdiscount(String code1){
        kalender.set(2022,03,12);
        Date expired1 = kalender.getTime();
        kalender.set(2023,07,12);
        Date expired2 = kalender.getTime();
        Date[] validityPeriod = {expired1,expired2};
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        boolean isValidVoucher = false;
        while (!isValidVoucher) {
            Date sekarang = new Date();
            for(int i=0; i < code.length; i++){
                if(Objects.equals(code1, code[i])){
                    boolean perbandingan = validityPeriod[i].before(sekarang);
                    if(!perbandingan){
                        System.out.println("Kode voucher berhasil dipakai. Berhasil mendapatkan diskon sebesar: " + (discount[i] * 100) + "%");
                        return discount[i];
                    } else {
                        String strDate = df.format(validityPeriod[i]);
                        System.out.println("Kode voucher expired. Expired pada tanggal " + strDate + ".");
                        break;
                    }
                }
                if (i == code.length - 1) {
                    System.out.println("Kode voucher salah.");
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Apakah Anda ingin memasukkan kode voucher baru? (Y/N)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("Masukkan kode voucher baru: ");
                code1 = scanner.nextLine();
            } else {
                isValidVoucher = true;
            }
        }
        return 0;
    }
}
