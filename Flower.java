public class Flower {
    private int id;
    private String name;
    private String scientificName;
    private String meaning;
    private String imageURL;

    public Flower(int id, String name, String scientificName, String meaning, String imageURL) {
        this.id = id;
        this.name = name;
        this.scientificName = scientificName;
        this.meaning = meaning;
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDetails() {
        return "Name: " + name + "\nScientific Name: " + scientificName + "\nMeaning: " + meaning + "\nImage: " + imageURL;
    }
}
