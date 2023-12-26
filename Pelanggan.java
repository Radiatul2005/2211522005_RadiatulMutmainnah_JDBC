import java.util.Scanner;

public class Pelanggan extends Tranksaksi implements DetailTranksaksi 
{
    private String namaPelanggan;
    private String nomorHandphone;
    private String alamatPelanggan;

    public Pelanggan() 
    {
        masukkanDetails();
    }

    @Override
    public void masukkanDetails() 
    {
        System.out.println("Input Data");
        System.out.println("------------------------");
        System.out.println("Data Pelanggan");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Pelanggan : ");
        this.namaPelanggan = scanner.nextLine();
        System.out.print("Nomor HP : ");
        this.nomorHandphone = scanner.nextLine();
        System.out.print("Alamat : ");
        this.alamatPelanggan = scanner.nextLine();
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Pelanggan");
        System.out.println("---------------------------");
        System.out.println("Nama : " + namaPelanggan);
        System.out.println("Nomor HP : " + nomorHandphone);
        System.out.println("Alamat : " + alamatPelanggan);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
