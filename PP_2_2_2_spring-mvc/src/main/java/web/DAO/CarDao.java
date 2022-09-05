package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    List<Car> cars = new ArrayList<>();



    {
        cars.add(new Car("Lamborgini", "yelow", 2022));

        cars.add(new Car("BMW", "black",1990 ));

        cars.add(new Car("Mersedec", "cream", 1991));

        cars.add(new Car("VAZ", "white", 1999));

        cars.add(new Car("Volvo", "red", 2020));


    }




    public List<Car> getCarsCount() {
        return cars;
    }
}