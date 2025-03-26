import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Application app = new Application();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan beberapa bunga ke dalam kamus
        app.getDictionary().addFlower(new Flower(1, "Mawar", "Rosa", "Melambangkan cinta dan kasih sayang", "mawar.jpg"));
        app.getDictionary().addFlower(new Flower(2, "Melati", "Jasminum", "Melambangkan kesucian dan ketulusan", "melati.jpg"));
        app.getDictionary().addFlower(new Flower(3, "Bunga Matahari", "Helianthus", "Melambangkan kegembiraan dan kesetiaan", "bunga_matahari.jpg"));

        // Registrasi dan Login Pengguna
        User loggedInUser = app.registerUser("Alice", "password123");
        loggedInUser = app.login("Alice", "password123");

        if (loggedInUser != null) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Cari bunga");
                System.out.println("2. Tambah ke favorit");
                System.out.println("3. Hapus dari favorit");
                System.out.println("4. Lihat daftar favorit");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");

                int choice = -1;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Masukkan kata kunci bunga: ");
                        String keyword = scanner.nextLine();
                        List<Flower> searchResults = app.getDictionary().searchFlower(keyword);
                        if (searchResults.isEmpty()) {
                            System.out.println("Bunga tidak ditemukan.");
                        } else {
                            System.out.println("Hasil pencarian:");
                            for (Flower flower : searchResults) {
                                System.out.println(flower.getDetails());
                                System.out.println("--------------------------");
                            }
                        }
                        break;

                    case 2:
                        System.out.print("Masukkan nama bunga untuk ditambahkan ke favorit: ");
                        String addFlowerName = scanner.nextLine();
                        boolean found = false;
                        for (Flower flower : app.getDictionary().getAllFlowers()) {
                            if (flower.getName().equalsIgnoreCase(addFlowerName)) {
                                loggedInUser.addToFavorites(flower);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Bunga dengan nama tersebut tidak ditemukan.");
                        }
                        break;

                    case 3:
                        System.out.print("Masukkan nama bunga untuk dihapus dari favorit: ");
                        String removeFlowerName = scanner.nextLine();
                        boolean removed = false;
                        for (Flower flower : loggedInUser.getFavoriteFlowers()) {
                            if (flower.getName().equalsIgnoreCase(removeFlowerName)) {
                                loggedInUser.removeFromFavorites(flower);
                                removed = true;
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Bunga dengan nama tersebut tidak ada di daftar favorit.");
                        }
                        break;

                    case 4:
                        System.out.println("Daftar bunga favorit:");
                        if (loggedInUser.getFavoriteFlowers().isEmpty()) {
                            System.out.println("Belum ada bunga favorit.");
                        } else {
                            for (Flower flower : loggedInUser.getFavoriteFlowers()) {
                                System.out.println(flower.getDetails());
                                System.out.println("--------------------------");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Terima kasih telah menggunakan aplikasi!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opsi tidak valid. Silakan pilih antara 1 sampai 5.");
                }
            }
        }

        scanner.close();
    }
}
