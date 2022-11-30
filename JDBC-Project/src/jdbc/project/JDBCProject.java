
package jdbc.project;

import DB.DBHelper;
import java.util.ArrayList;


public class JDBCProject {


    public static void main(String[] args) {
//        DBHelper .getConnection();
        MahasiswaModel mhs = new MahasiswaModel();
        
        Mahasiswa mhs1 = new Mahasiswa("2117051076", "Keyvin Jourdan");
        Mahasiswa mhs2 = new Mahasiswa("2117051031", "M Abdi Firdaus");
        Mahasiswa mhs3 = new Mahasiswa("2117051024", "John Wilken C.N");
        Mahasiswa mhs4 = new Mahasiswa("2117051044", "Rafi Ramadhan");
        Mahasiswa mhs5 = new Mahasiswa("2117051066", "Faiz Muzaki");
        
        Mahasiswa mhs6 = new Mahasiswa("2117051066", "Rizqi Ibadurrohman");
        
        
        mhs.addMahasiswa(mhs2);
//        mhs.addMahasiswa(mhs3);
//        mhs.addMahasiswa(mhs4);
//        mhs.addMahasiswa(mhs5);
        mhs.deleteMahasiswa(mhs3);
        mhs.updateMahasiswa(mhs6);
        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        
        for (int i = 0; i < listMahasiswa.size(); i++){
            System.out.println("Nama : " + listMahasiswa.get(i).getNama());
            System.out.println("NPM  : " + listMahasiswa.get(i).getNpm());
            System.out.println("");
        }
    }
    
}
