public class Mawar extends Bunga {
    private String aroma;

    public Mawar(String warna, double harga, String aroma) {
        super("Mawar", warna, harga);
        this.aroma = aroma;
    }

    public void info() {
        super.info();
        System.out.println("Aroma: " + aroma);
        System.out.println("Makna: Mawar melambangkan cinta dan kasih sayang.");
    }
}
