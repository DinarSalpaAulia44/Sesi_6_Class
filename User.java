import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private List<Flower> favoriteFlowers;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.favoriteFlowers = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public List<Flower> getFavoriteFlowers() {
        return favoriteFlowers;
    }

    public void addToFavorites(Flower flower) {
        if (!favoriteFlowers.contains(flower)) {
            favoriteFlowers.add(flower);
            System.out.println(flower.getName() + " added to favorites.");
        } else {
            System.out.println(flower.getName() + " is already in favorites.");
        }
    }

    public void removeFromFavorites(Flower flower) {
        if (favoriteFlowers.remove(flower)) {
            System.out.println(flower.getName() + " removed from favorites.");
        } else {
            System.out.println(flower.getName() + " is not in favorites.");
        }
    }
}
