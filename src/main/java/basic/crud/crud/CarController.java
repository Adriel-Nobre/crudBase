package basic.crud.crud;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    //@Autowired -injetado via contrutor do lombok
    CarRepository carRepository;

    @GetMapping("/car")
    public List<Car> allCars(){
        return carRepository.findAll();
    }
    @GetMapping("/car/{id}")
    public Car findById(@PathVariable Long id){
        return carRepository.findById(id).get();
    }
    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car){
        return carRepository.save(car);
    }
    @DeleteMapping("/car/{id}")
    public void deleteCarById(@PathVariable Long id){
        carRepository.deleteById(id);
    }

}
