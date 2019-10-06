class Pegawai {
    private static class Node {
        int nip;
        String nama;
        String jabatan;
        Node next;
        Node prev;

        Node(int a, String b, String c) {
            this.nip = a;
            this.nama = b;
            this.jabatan = c;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;

    void tambah(Pegawai list, int a, String nama, String jabatan) {
        // pembuatan node baru
        Node data_pegawai = new Node(a, nama, jabatan);
        if(list.head == null) {
            list.head = data_pegawai;
            list.tail = data_pegawai;
        }
        // jika tidak kosong maka data akan disisipkan setelah data yang ada
        else {
            data_pegawai.next = list.tail;
            data_pegawai.prev = null;
            list.tail.prev = data_pegawai;
            list.tail = data_pegawai;
        }
    }

    void lihat(Pegawai list) {
        Node view = list.tail;
        System.out.println("=== DATA PEGAWAI ===");

        // pencarian data
        while(view != null) {
            System.out.println(view.nama + " -> " + view.jabatan);
            view = view.next;
        }
        System.out.println("====================");
    }
}

public class npmModul2LinkList {
    public static void main(String[] args) {
        Pegawai karyawan = new Pegawai();
        karyawan.tambah(karyawan, 1, "andi", "programmer");
        karyawan.tambah(karyawan, 2, "budi", "designer");
        karyawan.tambah(karyawan, 3, "cici", "PM");
        karyawan.tambah(karyawan, 4, "didi", "programmer");
        karyawan.lihat(karyawan);
    }
}