import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("TOKO MAS YESUS");

        login();
        
        

        
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int choose;

        System.out.println("1. Barang elektronik");
        System.out.println("2. Alat musik");
        System.out.print("Pilihan : ");

        choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Elektronik");
                break;
            case 2:
                System.out.println("Alat musik");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        String username, password;
        int userRole;
    
        System.out.println("Silahkan Login");
        System.out.println("1. Login sebagai pegawai");
        System.out.println("2. Login sebagai guest");
    
        while (true) {
            System.out.print("Pilihan : ");
            userRole = input.nextInt();
    
            System.out.print("Username : ");
            username = input.next();
            System.out.print("Password : ");
            password = input.next();
    
            if (userRole == 1) {
                // Handle clerk login
                if (username.equals("admin") && password.equals("admin")) {
                    System.out.println("Login berhasil sebagai clerk");
                    menu();
                    // TODO: Do something for clerk login
                    break;
                } else {
                    System.out.println("Username atau password salah");
                }
            } else if (userRole == 2) {
                // Handle guest login
                if (username.equals("user") && password.equals("user")) {
                    System.out.println("Login berhasil sebagai guest");
                    menuPembeli();
                    // TODO: Do something for guest login
                    break;
                } else {
                    System.out.println("Username atau password salah");
                }
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }
    

    public static void menuPembeli(){
        Scanner input = new Scanner(System.in);

        int choose;

        System.out.println("1. Barang elektronik");
        System.out.println("2. Alat musik");
        System.out.println("3. Silver membership");
        System.out.println("4. Gold membership");
        System.out.println("5. Premium memberhsip");
        System.out.print("Pilihan : ");

        choose = input.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Elektronik");
                break;
            case 2:
                System.out.println("Alat musik");
                break;
            case 3:
                System.out.println("Silver");
                break;
            case 4:
                System.out.println("Gold");
                break;
            case 5:
                System.out.println("Premium");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }
    //beli membership
    //input voucher ex : input code ditusi
    
    
    
}
