package products;

import java.util.List;

public class Art extends App {



    public Art(String name, Double price, String description, float version, List<String> authors) {
        super(name, price, description, version, authors);
    }

    @Override
    boolean ageCheck(int Pegi) {
        return false;
    }
}
