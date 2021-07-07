package se.lexicon.simon.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.simon.model.Car;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CarDaoImplTest {

    CarDaoImpl carDao;
    Car testObject;

    @Before
    public void before(){
        carDao = new CarDaoImpl(new ArrayList<>());

        testObject = new Car(10, "ABC123", LocalDate.parse("2020-01-01"), "Volvo", null);
        carDao.add(testObject);
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
}