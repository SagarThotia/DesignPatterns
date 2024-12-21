package DesignPatternsDS.DesignPatternsSDOracle.CreationalDesignPatterns.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)
    {
        List<Car> carList = new ArrayList<>();
        Breeza breeza = new Breeza();
        breeza.setModelYear(2024);

        WagonR wagonR = new WagonR();
        wagonR.setModelYear(2021);

        carList.add(breeza);
        carList.add(wagonR);

        for (Car car : carList)
        {
            System.out.println(car.getClass().getName() + " " + car.toString() + " " + car.getModelYear());
        }

        List<Car> copyCarList = new ArrayList<>();

//        for (Car car : carList)
//        {
//            if(car instanceof Breeza)
//            {
//                int modelYear = ((Breeza)car).getModelYear();
//                Breeza copyBreeza = new Breeza();
//                copyBreeza.setModelYear(modelYear);
//                copyCarList.add(copyBreeza);
//            }else if (car instanceof WagonR)
//            {
//                int modelYear = ((WagonR)car).getModelYear();
//                WagonR copyWagonR = new WagonR();
//                copyWagonR.setModelYear(modelYear);
//                copyCarList.add(copyWagonR);
//            }
//        }

        for (Car car : carList)
        {
            copyCarList.add(car.clone(car));
        }


        for (Car car : copyCarList)
        {
            System.out.println(car.getClass().getName() + " " + car.toString() + " " + car.getModelYear());
        }

    }
}


/**
 * According to Solid design principle.
 * Whenever we see instanceof checks it is an antipattern.
 * If you propose to solution to the interviewer it will reject you immediately
 *
 * Prototype Design Pattern is the solution.
 * 1. Create a clone interface
 *    getClone() method is responsible for creating
 *
 * 2. Cloneable Marker Interface is automatically creates a clone of an object of copy constructor.
 */