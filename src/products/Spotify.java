package products;

import java.util.List;

public class Spotify extends App {

    public Spotify(String name, Double price, String description, float version, List<String> authors) {
        super(name, price, description, version, authors);
    }

    @Override
    boolean ageCheck(int Pegi) {
        return false;
    }
}
