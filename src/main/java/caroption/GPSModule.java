package caroption;

import edu.cu.ooad.Car;
import edu.cu.ooad.CarOption;

public class GPSModule extends CarOption {
    public GPSModule(Car car) {
        super(car, 20.0);
    }

    @Override
    public Double getRentalCost(Integer numOfDays) {
        return optionPrice + car.getRentalCost(numOfDays);
    }
}
