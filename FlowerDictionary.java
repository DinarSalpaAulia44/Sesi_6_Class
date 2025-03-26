import java.util.ArrayList;
import java.util.List;

public class FlowerDictionary {
    private List<Flower> flowers;

    public FlowerDictionary() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> searchFlower(String keyword) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                flower.getScientificName().toLowerCase().contains(keyword.toLowerCase()) ||
                flower.getMeaning().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(flower);
            }
        }
        return result;
    }

    public List<Flower> getAllFlowers() {
        return flowers;
    }
}
