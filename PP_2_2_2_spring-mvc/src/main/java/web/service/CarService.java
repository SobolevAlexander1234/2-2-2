package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsCount(List<Car> cars, int count);

    List<Car>getCarsCount(String cars, int count);
}
