import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static ArrayList<guruEntity> dataguru = new ArrayList();
    static ArrayList<muridEntity> datamurid = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    private static int indexguru;

    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Bimbel");
        int pil;
        Dataguru();
        do {
            System.out.println("1. Daftar = ");
            System.out.println("2. Login = ");
            System.out.println("3. Exit");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    daftar();
                    break;
                case 2:
                    System.out.print("Nama = ");
                    String nama = input.next();
                    System.out.print("Password = ");
                    String password = input.next();
                    view(nama, password);
                    break;
            }

        } while (pil != 3);
    }

    static void daftar(){
        System.out.print("Masukkan Nama = ");
        String nama = input.next();
        System.out.print("Password = ");
        String password = input.next();
        System.out.print("Masukkan Notelp = ");
        String notlp = input.next();
        System.out.print("alamat = ");
        String alamat = input.next();
        System.out.print("Tanggal lahir = ");
        Date tggllahir = new Date(input.next());
        for (int i = 0;i < dataguru.size();i++) {
            System.out.println(i + ". " + dataguru.get(i).nama);
        }
        System.out.println("Pilih Guru = ");
        int indexguru = input.nextInt();
        for (int i = 0; i < mapelEntity.mapel.length;i ++) {
            System.out.println(i + ". " +mapelEntity.mapel[i]);
        }
        System.out.println("Pilih Mapel : ");
        int indexmapel = input.nextInt();
        datamurid.add(new muridEntity(nama, password, notlp, alamat, tggllahir,indexmapel,indexguru));
        }
    static void view(String nama, String password) {
        for (int i = 0; i < datamurid.size(); i++){
            if ((nama.equals(datamurid.get(i).getnama())) && (password.equals(datamurid.get(i).getpassword()))){
                System.out.println("Nama = " + datamurid.get(i).getnama());
                System.out.println("Alamat = " + datamurid.get(i).getalamat());
                System.out.println("No Telp = " + datamurid.get(i).getnotlp() );
                System.out.println("Tanggal Lahir = " + new SimpleDateFormat("dd-MM-yyyy").format(datamurid.get(i).gettggllahir()));
                System.out.println("Nama Guru = " + dataguru.get(datamurid.get(i).indexguru).getNama());
                System.out.println("Mata Pelajaran = " + mapelEntity.mapel[datamurid.get(i).indexmapel]);
            }else {
                System.out.println("Nama atau Pasword Salah");
            }
        }
    }
    static void Dataguru(){
        String[] nama = {"Anggita","Eka","Rewina"};
        String[] alamat = {"Surabaya","Gresik","Medan"};
        String[] notlpn = {"0879","0912","0845"};
        String[] passward = {"092","021","34"};
        String[] TglLahir = {"04/05/2000", "22/04/2001","01/12/2002"};
                     for (int a = 0;a < notlpn.length; a++){
                         dataguru.add(new guruEntity(nama[a], alamat[a], notlpn[a], passward[a], new Date(TglLahir[a])));
                     }
        }
    }
