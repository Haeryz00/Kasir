import java.util.Scanner;

import voucher.cashier;
import voucher.voucher;
import barang.jual.lampu;
import barang.jual.piano;

public class App {
    static void ngulang(){
        System.out.println("Masukkan input yang benar!\n");
    }
    public static void main(String[] args) {
        piano piano = new piano();
        lampu lampu = new lampu();
        cashier kasir = new cashier();
        Scanner input = new Scanner(System.in);
        voucher vocer = new voucher();

        String kode;
        char yesno;
        float diskon;
        int item,stock=0,stockUser,ulang = 1, duit, total = 0;
        String nama="",membertype="",namaitem="";

        stockUser = 0;

        stock -= stockUser;

        while (ulang == 1){
                System.out.println("\nSelamat datang di Toko andiiiiiii");
                System.out.print("Berbelanja sebagai Karyawan? Y/N: ");
                yesno = input.next().charAt(0);
                if(yesno == 'Y'|| yesno == 'y' || yesno == 'N' || yesno == 'n'){}
                else {
                    ngulang();
                    break;
                }
                input.nextLine();

                System.out.print("Masukkan nama anda: ");
                nama = input.nextLine();
                kasir.setName(nama);
                if(yesno == 'N' || yesno == 'n'){
                    if(kasir.isMember() == Boolean.TRUE){
                        System.out.printf("\nSelamat anda mendapatkan diskon sebanyak %d%% sebagai %s member\n", (int)(kasir.getMembershipDiscount() * 100), kasir.getMemberType());
                    }
                    membertype = kasir.getMemberType() + " Member";

                }else {
                    membertype = "Karyawan";
                    kasir.isKaryawan();
                    System.out.printf("\nSelamat anda mendapatkan diskon sebanyak %d%% sebagai karyawan\n", (int)(kasir.getMembershipDiscount() * 100));
                }

                System.out.println("Selamat datang tuan/putri "+ nama);
                System.out.println("\nItem yang tersedia: ");
                System.out.printf("1.Piano \nBrand: %s \nModel: %s\nHarga: %d\nStock awal: %d\nDiscount: %s",piano.getBrand(),piano.getModel(),piano.getPrice(),piano.getStock(),piano.getOnSale());
                System.out.printf("\n\n2.Lampu \nBrand: %s \nModel: %s\nHarga: %d\nStock awal: %d\nDiscount: %s\n",lampu.getBrand(),lampu.getModel(),lampu.getPrice(),lampu.getStock(),lampu.getOnSale());

                System.out.print("\nPilih item yang diinginkan: ");
                item = input.nextInt();
                if(item == 1 || item == 2){}else {
                    ngulang();
                    break;
                }
                if(item == 1){
                    if(piano.getOnSale() == Boolean.TRUE){
                        System.out.printf("Selamat anda mendapatkan diskon sebanyak %d%%\n", (int)(piano.getDiscount() * 100));
                    }
                    namaitem = "Piano";
                    

                    piano.updateStock(stockUser); // update piano stock
                    stock = piano.getStock(); // get updated piano stock

                    

                }
                else if (item == 2) {
                    if(lampu.getOnSale() == Boolean.TRUE){
                        System.out.printf("Selamat anda mendapatkan diskon sebanyak %d%%\n", (int)(lampu.getDiscount() * 100));
                    }
                    namaitem = "Lampu";
                    

                    lampu.updateStock(stockUser); // update lampu stock
                    stock = lampu.getStock(); // get updated lampu stock
                }

                System.out.print("Ingin membeli berapa buah?: ");
                stockUser = input.nextInt();
                if(stockUser > stock){
                    System.out.println("Anda melebihi stock dari item.\n");
                    break;
                }

                stock -= stockUser;
                System.out.print("Apakah anda mempunyai kode voucher? Y/N: ");
                yesno = input.next().charAt(0);
                input.nextLine();
                if(yesno == 'y' || yesno == 'Y'){
                    System.out.print("Silahkan masukkan kode voucher: ");
                    kode = input.nextLine();
                    diskon = vocer.getdiscount(kode);
                    if(diskon != 0){
                        kasir.setDisc(diskon);
                    }
                }

                System.out.println("\nNama pembeli: " + nama);
                System.out.printf("Nama item: %s\n", namaitem);
                if(item == 1){
                    kasir.setPrice((float)(piano.getPrice() * stockUser));
                    if(piano.getOnSale() == Boolean.TRUE){
                        kasir.setDisc(piano.getDiscount());
                    }
                } else {
                    kasir.setPrice((float)(lampu.getPrice() * stockUser));
                    if(lampu.getOnSale() == Boolean.TRUE){
                        kasir.setDisc(lampu.getDiscount());
                    }
                }
                total += (int) kasir.getTotal();
                System.out.printf("Harga total: %d\n", total);
                System.out.printf("Anda telah membeli %d %s dengan total harga %d\n", stockUser, namaitem, (int) kasir.getTotal());
                System.out.printf("Anda akan membeli %s sebanyak %d buah\n\n",namaitem,stockUser);
                System.out.print("Masukkan uang anda: ");
                duit = input.nextInt();
                if(total > duit){
                    System.out.println("Uang anda tidak mencukupi.");
                }else {
                    System.out.println("Pembayaran berhasil. Uang kembalian: " + (duit - total));
                }
                System.out.print("\nApakah anda ingin mengulang? 0/1: ");
                ulang = input.nextInt();
                if(ulang == 1){System.out.println("");}
            
        }
        System.out.println("Terima kasih telah berbelanja.");
    } 
}