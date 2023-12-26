import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Head extends Tranksaksi implements DetailTranksaksi 
{
    LocalDate Tanggal = LocalDate.now(); //Menambahkan hari dan tanggal saat tranksaksi
    LocalTime Waktu = LocalTime.now();   // Menambahkan waktu saat tranksaksi
    DayOfWeek hari = Tanggal.getDayOfWeek();
    int tahun = Tanggal.getYear();
    int bulan = Tanggal.getMonthValue();
    int tanggal = Tanggal.getDayOfMonth();
    int jam = Waktu.getHour();
    int menit = Waktu.getMinute();
    int detik = Waktu.getSecond();

    public void tampilkanDetails()
    {
        System.out.println("=========================================");
        System.out.println("KUROKAI MARKET");
        System.out.println("Tanggal : " + hari + ", " + tanggal + "/" + bulan + "/" + tahun);
        System.out.println("Waktu : " + jam + ":" + menit + ":" + detik + "WIB");
        System.out.println("=========================================");
    }
}

