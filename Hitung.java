package week1;
import java.util.ArrayList;

class BangunDatar {
    String nama;
    float luas;
    float keliling;

    public BangunDatar(String nama, float luas, float keliling) {
        this.nama = nama;
        this.luas = luas;
        this.keliling = keliling;
    }
}

public class Hitung {
    static float Pi = 3.14f;
    static ArrayList<BangunDatar> daftarBangun = new ArrayList<>();

    public static void main(String[] args) {
        // Menambahkan beberapa bangun datar
        tambahBangun("Persegi", lpersegi(3), kpersegi(3));
        tambahBangun("Persegi", lpersegi(5), kpersegi(5)); // Persegi dengan ukuran berbeda
        tambahBangun("Segitiga", lsegitiga(3, 5), ksegitiga(3, 4, 5));
        tambahBangun("Segitiga", lsegitiga(6, 8), ksegitiga(6, 8, 10)); // Segitiga lain
        tambahBangun("Lingkaran", llingkaran(7), klingkaran(7));
        tambahBangun("Lingkaran", llingkaran(10), klingkaran(10)); // Lingkaran lain
        tambahBangun("Kubus", lkubus(5), kkubus(5));
        tambahBangun("Kubus", lkubus(10), kkubus(10)); // Kubus lain
        
        // Menampilkan daftar nilai
        daftarNilai();
    }

    public static void tambahBangun(String nama, float luas, float keliling) {
        daftarBangun.add(new BangunDatar(nama, luas, keliling));
    }

    public static void daftarNilai() {
        System.out.println("\nDaftar Nilai Bangun Datar:");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s %-10s %-10s\n", "Nama", "Luas", "Keliling");
        System.out.println("----------------------------------------");
        
        for (BangunDatar bangun : daftarBangun) {
            System.out.printf("%-10s %-10.2f %-10.2f\n", 
                            bangun.nama, bangun.luas, bangun.keliling);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total data: " + daftarBangun.size());
    }

    public static float lpersegi(float s) {
        return s * s;
    }

    public static float kpersegi(float s) {
        return 4 * s;
    }

    public static float lsegitiga(float a, float t) {
        return a * t / 2;
    }

    public static float ksegitiga(float a, float b, float c) {
        return a + b + c;
    }

    public static float llingkaran(float r) {
        return Pi * r * r;
    }

    public static float klingkaran(float r) {
        return 2 * Pi * r;
    }

    public static float lkubus(float s) {
        return 6 * s * s;
    }

    public static float kkubus(float s) {
        return 12 * s;
    }
}