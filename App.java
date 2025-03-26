public class App {
    public static void main(String[] args) throws Exception {
        Mawar mawarMerah = new Mawar("Merah", 25000, "Manis");
        BungaMatahari bungaMatahariBesar = new BungaMatahari(30000, 1.5);
        Melati melatiPutih = new Melati(20000, true);

        System.out.println("Informasi Bunga:");
        mawarMerah.info();
        mawarMerah.mekar();
        System.out.println();

        bungaMatahariBesar.info();
        bungaMatahariBesar.mekar();
        System.out.println();

        melatiPutih.info();
        melatiPutih.mekar();
    }
}
