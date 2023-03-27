package pertemuan4_pbo;

import java.util.Scanner;



public class Latihan1 {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;
    private float totalPembelian;
    private String bonus;

    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalPembelian = harga * jumlah;
        setBonus();
    }

    private void setBonus() {
        if (totalPembelian >= 500000 && jumlah > 5) {
            bonus = "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            bonus = "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            bonus = "Ballpoint";
        } else {
            bonus = "Tidak mendapat bonus";
        }
    }

    public float getTotalPembelian() {
        return totalPembelian;
    }

    public String getBonus() {
        return bonus;
    }

    public void cetakNota() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Barang: " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Pembelian: " + totalPembelian);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Latihan1 latihan1 = new Latihan1();
        String inputLagi = "Y";
        while (inputLagi.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan Kode Barang: ");
            String kode = input.nextLine();
            System.out.print("Masukkan Nama Barang: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Harga Barang: ");
            float harga = input.nextFloat();
            System.out.print("Masukkan Jumlah Barang: ");
            int jumlah = input.nextInt();
            input.nextLine(); // untuk mengonsumsi newline character setelah input jumlah
            latihan1.setData(kode, nama, harga, jumlah);
            latihan1.cetakNota();
            System.out.print("Input data lagi [Y/T]? ");
            inputLagi = input.nextLine();
        }
    }
}
/*Dalam implementasi di atas, method 'setData()' digunakan untuk mengisi data barang yang akan dijual, method 'getTotalPembelian()'
  dan 'getBonus()' digunakan untuk menghitung total pembelian dan mendapatkan bonus yang didapatkan berdasarkan total pembelian
  dan jumlah barang, serta method cetakNota() untuk mencetak nota pembelian barang.
  
  Ketika program dijalankan, user diminta untuk menginputkan kode, nama, harga, dan jumlah barang yang ingin dibeli. Setelah itu,
  program akan memanggil method 'setData()' untuk menghitung total pembelian dan bonus yang didapat, kemudian mencetak nota pembelian
  menggunakan method 'cetakNota()'. Setelah itu, user akan ditanya apakah ingin menginput data lagi atau tidak menggunakan perintah
  'System.out.print("Input data lagi [Y/T]? ")' dan program akan terus berjalan selama user memilih untuk menginput data lagi dengan
   memasukkan "Y" pada saat ditanya. */
 */