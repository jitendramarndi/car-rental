package cartype;

import edu.cu.ooad.Car;
import edu.cu.ooad.util.UniqueIDGenerator;

public class Economy extends Car {

    public Economy() {
        super(Car.Type.ECONOMY, UniqueIDGenerator.getInstance().generateUniqueID("ECO"), 20.0);
    }

    @Override
    public Double getRentalCost(Integer numOfDays) {
        return pricePerDay*numOfDays;
    }
}
