package jdbc.project;

import DB.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection() ;
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO mhs VALUES( '"
                + mhs.getNpm() + "', '" + mhs.getNama()
                + "');";
        
        try {
            if (CONN.createStatement().executeUpdate(insert) > 0){
            System.out.println("Berhasil Input Data");
            }else{
                System.out.println("Gagal Input Data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Input Data");
        }
    }
    public ArrayList<Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM mhs";
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Mahasiswa temp = new Mahasiswa(rs.getString("npm"), rs.getString("nama"));
                mhs.add(temp);
            }
            System.out.println("Berhasil Mengambil Data");
//            System.out.println(rs);
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Mengambil Data");
        }
        return mhs;
    }
    
    
    public void updateMahasiswa(Mahasiswa mhs){
        String update = "UPDATE mhs SET npm = '"
                + mhs.getNpm() + "', nama = '"
                + mhs.getNama() + "' WHERE npm = '"
                + mhs.getNpm()+"';";
        
        
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Berhasil Memperbarui Data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Memperbarui data");
        }
    }
    
    public void deleteMahasiswa(Mahasiswa mhs){
        String delete = "DELETE FROM mhs WHERE npm = '" 
                + mhs.getNpm() + "';";
        
        
        try {
            CONN.createStatement().executeUpdate(delete);
            System.out.println("Berhasil Menghapus Data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Menghapus Data");
        }
    }
}
    
    
    

