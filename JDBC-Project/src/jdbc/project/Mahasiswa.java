package jdbc.project;

public class Mahasiswa {
    private String npm;
    private String nama;
//    private String npmLama;
    private String npmBaru;
    private String ubahNama;

//    public Mahasiswa(String npmLama, String npmBaru, String ubahNama) {
//        this.npmLama = npmLama;
//        this.npmBaru = npmBaru;
//        this.ubahNama = ubahNama;
//    }
//
//    public String getNpmLama() {
//        return npmLama;
//    }
//
//    public void setNpmLama(String npmLama) {
//        this.npmLama = npmLama;
//    }
//
//    public String getNpmBaru() {
//        return npmBaru;
//    }
//
//    public void setNpmBaru(String npmBaru) {
//        this.npmBaru = npmBaru;
//    }
//
//    public String getUbahNama() {
//        return ubahNama;
//    }
//
//    public void setUbahNama(String ubahNama) {
//        this.ubahNama = ubahNama;
//    }

    
    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
