import java.util.Scanner;

public class Barang extends Tranksaksi implements DetailTranksaksi 
{
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;
    private double totalHarga;
    private String kodeBarang;


    // Getter dan Setter untuk kodeBarang
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    // Getter dan Setter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // Getter dan Setter untuk hargaBarang
    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    // Getter dan Setter untuk jumlahBarang
    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public Barang() 
    {
        masukkanDetails();
        calculateTotal();
    }

    @Override
    public void masukkanDetails() 
    {
        System.out.println("---------------------");
        System.out.println("Data Barang");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode Barang : ");
        this.kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang : ");
        this.namaBarang = scanner.nextLine();
        boolean harga = false;
        while (!harga) 
        {
            try //Exception
            {
                    System.out.print("Harga Barang : ");
                    this.hargaBarang = Double.parseDouble(scanner.nextLine());
                    if (hargaBarang <= 0) throw new Exception();
                    harga = true;
            }
            catch (Exception e) 
            {
                System.out.println("Input Harga Salah");
            }
        }
        boolean jumlah = false;
        while (!jumlah) 
        {
            try //Exception
            {
                    System.out.print("Jumlah Beli : ");
                    this.jumlahBarang = scanner.nextInt();
                    if (jumlahBarang <= 0 || jumlahBarang>1000) throw new Exception();
                    jumlah = true;
            }
            catch (Exception e) 
            {
                System.out.println("Input Jumlah Salah");
            }
        }
    }

    private void calculateTotal()
    {
        this.totalHarga = hargaBarang * jumlahBarang;
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Barang:");
        System.out.println("-----------------------------");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Total : " + totalHarga);
        System.out.println("+++++++++++++++++++++++++++++++");
    }    
}
