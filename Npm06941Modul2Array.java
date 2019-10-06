class Pegawai {
    String[] nama = new String[4];
    String[] jabatan = new String[4];
    

    void tambahData(int num, String a, String b) {
        nama[num-1] = a;
        jabatan[num-1] = b;
    }

    void lihatData() {
        for(int i = 0; i < 4; i++) {
            System.out.println(nama[i] + " -> " + jabatan[i]);
        }
    }
   
}

public class Npm06941Modul2Array {
    public static void main(String[] args) {
        Pegawai karyawan = new Pegawai();

        karyawan.tambahData(1, "andi", "programmer");
        karyawan.tambahData(2, "budi", "designer");
        karyawan.tambahData(3, "cici", "PM");
        karyawan.tambahData(4, "didi", "programmer");

        karyawan.lihatData();
    }
}