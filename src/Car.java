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
            System.out.println("Maksimalna brzina: " + maxSpeed);
            System.out.println("Tezina :" + weight);
            System.out.println("Da li je upaljen: " + isTheCarOn);
            System.out.println("Model: " + model);
            System.out.println("Maksimalna kolicina ulja: " + maxFuel);
            System.out.println("Trenutno gorivo: " + currentFuel);
            System.out.println("Potrosnja:" + consumption);
            System.out.println("Predjena kilometraza: " + milegePassed);
            



        }
}
