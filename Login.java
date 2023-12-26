import java.util.Random;
import java.util.Scanner;

public class Login extends Tranksaksi implements DetailTranksaksi {

    String userName = "KuroKai_Market";
    String password = "Kaito1412";
    String captcha;

    public void Login() {
        masukkanDetails();
    }

    public void masukkanDetails() {
        System.out.println("Selamat Datang di KuroKai Market");
        System.out.println("-----------------------------------");
        System.out.println("LOGIN");
        Scanner scanner = new Scanner(System.in);
        boolean login = false;
        while (!login) {
            try {
                System.out.print("Masukkan username : ");
                String masukkanUserName = scanner.nextLine();
                System.out.print("Masukkan password : ");
                String masukkanPassword = scanner.nextLine();
                
                if (masukkanUserName.equals(userName) && masukkanPassword.equals(password)) {
                    System.out.println("--------------------------");
                    generateCaptcha(); // Membuat CAPTCHA setelah login berhasil
                    System.out.print("Masukkan CAPTCHA : " + captcha + " : ");
                    String enteredCaptcha = scanner.nextLine();
                    
                    if (enteredCaptcha.equals(captcha)) {
                        System.out.println("CAPTCHA Benar");
                        System.out.println("Login Berhasil");
                        System.out.println("--------------------------");
                        login = true;
                    } else {
                        throw new Exception();
                    }
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Login Gagal. Masukkan Username, Password, dan CAPTCHA dengan benar");
                System.out.println("--------------------------");
            }
        }
    }

    // Metode untuk membuat CAPTCHA
    private void generateCaptcha() {
        Random random = new Random();
        int length = 6; // Panjang CAPTCHA
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = (char) (random.nextInt(26) + 'A'); // Menggunakan huruf kapital
            sb.append(ch);
        }
        captcha = sb.toString();
    }
}
