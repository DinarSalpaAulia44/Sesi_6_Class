import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<User> users;
    private FlowerDictionary dictionary;

    public Application() {
        this.users = new ArrayList<>();
        this.dictionary = new FlowerDictionary();
    }

    public User registerUser(String username, String password) {
        int userId = users.size() + 1;
        User newUser = new User(userId, username, password);
        users.add(newUser);
        System.out.println("User " + username + " registered successfully.");
        return newUser;
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.checkPassword(password)) {
                System.out.println("Login successful! Welcome, " + username);
                return user;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
    }

    public FlowerDictionary getDictionary() {
        return dictionary;
    }

    public List<User> getUsers() {
        return users;
    }
}
