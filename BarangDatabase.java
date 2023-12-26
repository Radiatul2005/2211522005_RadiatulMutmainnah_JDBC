import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BarangDatabase {

    public static void readData(Barang barang) {
        String query = "SELECT * FROM barang WHERE kodeBarang = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, barang.getKodeBarang());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                barang.setNamaBarang(rs.getString("namaBarang"));
                barang.setHargaBarang(rs.getDouble("hargaBarang"));
                barang.setJumlahBarang(rs.getInt("jumlahBarang"));
                // Set atribut lain berdasarkan kolom tabel
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateData(Barang barang) {
        String query = "UPDATE barang SET namaBarang = ?, hargaBarang = ?, jumlahBarang = ? WHERE kodeBarang = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, barang.getNamaBarang());
            pstmt.setDouble(2, barang.getHargaBarang());
            pstmt.setInt(3, barang.getJumlahBarang());
            pstmt.setString(4, barang.getKodeBarang());

            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Update berhasil!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readData() {
    }

    public static void updateData() {
    }

    
}
