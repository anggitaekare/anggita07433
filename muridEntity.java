import java.util.Date;
public class muridEntity extends Induk{

    int indexmapel;
    int indexguru;

    public muridEntity(String nama, String password, String notlp, String alamat, Date tggllahir, int indexmapel, int indexguru){
        super.nama = nama;
        super.password = password;
        super.notlp = notlp;
        super.alamat = alamat;
        super.tggllahir = tggllahir;
        this.indexmapel = indexmapel;
        this.indexguru = indexguru;
    }
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    public String getnotlp(){
        return notlp;
    }
    public void setnotlp(String notlp){
        this.notlp = notlp;
    }
    public String getalamat(){
        return alamat;
    }
    public void setalamat(String alamat){
        this.alamat = alamat;
    }
    public Date gettggllahir(){
        return tggllahir;
    }
    public void settggllahir(Date tggllahir){
        this.tggllahir = tggllahir;
    }
    public int getIndexmapel() {
        return indexmapel;
    }

    public void setIndexmapel(int indexmapel) {
        this.indexmapel = indexmapel;
    }

    public int getIndexguru() {
        return indexguru;
    }

    public void setIndexguru(int indexguru) {
        this.indexguru = indexguru;
    }
}



