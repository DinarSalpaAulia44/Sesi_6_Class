public class BungaMatahari extends Bunga {
    private double tinggi;

    public BungaMatahari(double harga, double tinggi) {
        super("Bunga Matahari", "Kuning", harga);
        this.tinggi = tinggi;
    }

    public void info() {
        super.info();
        System.out.println("Tinggi: " + tinggi + " meter");
        System.out.println("Makna: Bunga Matahari melambangkan kebahagiaan dan kesetiaan.");
    }
}
