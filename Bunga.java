public class Bunga {
    protected String nama;
    protected String warna;
    protected double harga;

    public Bunga(String nama, String warna, double harga) {
        this.nama = nama;
        this.warna = warna;
        this.harga = harga;
    }

    public void mekar() {
        System.out.println(nama + " sedang mekar dengan indah!");
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: Rp " + harga);
    }
}
