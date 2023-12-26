import java.util.Scanner;

public class Kasir extends Tranksaksi implements DetailTranksaksi  {
    String namaKasir;
    public Kasir()
    {
        masukkanDetails();
    }
    public void masukkanDetails()
    {
        System.out.println("---------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Kasir : ");
        this.namaKasir = scanner.nextLine();
        System.out.println();
        System.out.println();
    }
    public void tampilkanDetails()
    {
        System.out.println("Kasir : " + namaKasir);
        System.out.println();
        System.out.println();
    }
}
