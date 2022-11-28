import java.util.Date;

public class guruEntity extends Induk{

    public guruEntity(String nama, String alamat, String notlp, String password, Date tggllahir) {
        super.nama = nama;
        super.alamat = alamat;
        this.notlp = notlp;
        super.password = password;
        this.tggllahir = tggllahir;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTggllahir() {
        return tggllahir;
    }

    public void setTggllahir(Date tggllahir) {
        this.tggllahir = tggllahir;
    }
}
