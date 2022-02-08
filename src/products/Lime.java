package products;

import java.time.Period;
import java.util.List;

public class Lime extends App{

    Period rentalTime;
    final static int amountofScootersAvailable = 20;
    final static int amountOfScootersRented = 0;



    public Lime(String name, Double price, String description, float version, List<String> authors, Period rentalTime) {
        super(name, price, description, version, authors);
        this.rentalTime = rentalTime;



    }

    public int getAmountOfScootersForRent(){

        return 0;
    }

    @Override
    boolean ageCheck(int Pegi) {
        return false;
    }
}
