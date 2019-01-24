/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qa-popodne
 */
public class Car {
       int maxSpeed = 180;
       double weight = 1340.43;
        boolean isTheCarOn = false;
        String model = "Audi";
        double maxFuel = 100;
        double currentFuel = 50;
        int consumption = 5; //per km
        double milegePassed = 2000;
        
        public void printVariables(){
            System.out.println(maxSpeed);
            System.out.println(weight);
            System.out.println(isTheCarOn);
            System.out.println(model);
            System.out.println(maxFuel);
            System.out.println(currentFuel);
            System.out.println(consumption);
            System.out.println(milegePassed);
            



        }
}
