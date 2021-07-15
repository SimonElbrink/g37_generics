package se.lexicon.simon.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.simon.model.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CarDaoImplTest {

    CarDaoImpl carDao;
    Car testObject;

    @Before
    public void before(){
        carDao = new CarDaoImpl(new ArrayList<>());

        testObject = new Car(10, "ABC123", LocalDate.parse("2020-01-01"), "Volvo", null);
        Car car1 = new Car(20, "ABC321", LocalDate.parse("2017-01-01"), "Volvo", null);
        Car car2 = new Car(21, "CBA123", LocalDate.parse("2019-01-01"), "BMW", null);

        carDao.add(testObject);
        carDao.add(car1);
        carDao.add(car2);
    }

    @Test
    public void update() {
        //Arrange
        Car toUpdate = new Car(10, "AWESOME", LocalDate.parse("2020-01-01"), "Volvo", null);

        //Act
        Car result = carDao.update(toUpdate);

        //Assert
        assertNotNull(result);
        assertSame("AWESOME", carDao.findById(10).getRegNumber());

    }

    @Test
    public void findById(){

        //Arrange
        int idToFind = 10;

        //Act
        Car returnedCar = carDao.findById(idToFind);

        //Assert
        assertNotNull(returnedCar);
        assertEquals(testObject,returnedCar);



    }

    @Test
    public void findAllCarsByBrand_success() {

        //Arrange
        String brandToFind = "Volvo";
        int expectedSize = 2;

        //Act
        Collection<Car> carsFound = carDao.findAllCarsByBrand(brandToFind);

        //Assert
        assertEquals(expectedSize, carsFound.size());


    }

    @Test
    public void findAllCarsByBrand_IgnoresCasing() {

        //Arrange
        String brandToFind = "vOLvO";
        int expectedSize = 2;

        //Act
        Collection<Car> carsFound = carDao.findAllCarsByBrand(brandToFind);

        //Assert
        assertEquals(expectedSize, carsFound.size());

    }
    @Test
    public void findAllCarsByBrand_SpacesInParameter() {

        //Arrange
        String brandToFind = "  Volvo  ";
        int expectedSize = 2;

        //Act
        Collection<Car> carsFound = carDao.findAllCarsByBrand(brandToFind);

        //Assert
        assertEquals(expectedSize, carsFound.size());

    }
}