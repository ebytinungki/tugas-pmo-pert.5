public class PerhitunganSaldoTabungan {
    public static void main(String[] args) {
        // Inisialisasi saldo awal, bunga dan lama waktu
        double saldoAwal = 1000000;  // Saldo awal Rp. 1.000.000
        double bunga = 10;           // Bunga 10%
        int lamaBulan = 5;           // Lama waktu 5 bulan

        // Menampilkan saldo setiap bulan
        double saldo = saldoAwal;
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldo += saldo * (bunga / 100); // Menghitung bunga dan menambahkannya ke saldo
            System.out.println("Saldo di bulan ke-" + bulan + " : Rp. " + String.format("%.0f", saldo));
        }
    }
}