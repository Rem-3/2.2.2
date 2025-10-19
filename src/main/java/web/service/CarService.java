package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", "2022"),
            new Car("Honda", "Civic", "2023"),
            new Car("BMW", "X5", "2021"),
            new Car("Mercedes", "C-Class", "2023"),
            new Car("Audi", "A4", "2022")
    );

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        if (count >= 5 || count <= 0) {
            return getAllCars();
        }
        return cars.subList(0, Math.min(count, cars.size()));
    }

}
