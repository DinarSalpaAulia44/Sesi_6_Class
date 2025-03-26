public class Melati extends Bunga {
    private boolean harum;

    public Melati(double harga, boolean harum) {
        super("Melati", "Putih", harga);
        this.harum = harum;
    }

    public void info() {
        super.info();
        System.out.println("Harum: " + (harum ? "Ya" : "Tidak"));
        System.out.println("Makna: Melati melambangkan kesucian dan ketulusan.");
    }
}
