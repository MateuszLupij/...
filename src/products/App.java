package products;

import java.util.ArrayList;
import java.util.List;

public abstract class App {

    String name;
    Double price;
    String description;
    float version;
    int PEGI;
    List<String> authors;


    public App(String name, Double price, String description, float version, List<String> authors) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.version = version;
        this.authors = authors;
    }
    

    abstract boolean ageCheck(int Pegi);



}
