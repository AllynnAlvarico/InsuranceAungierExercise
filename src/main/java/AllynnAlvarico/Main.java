package AllynnAlvarico;

import AllynnAlvarico.enums.CountyIdentifier;
import AllynnAlvarico.model.Car;
import AllynnAlvarico.model.Driver;
import AllynnAlvarico.service.PolicyRegistrationService;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    PolicyRegistrationService prs = new PolicyRegistrationService();

    public Main(){
        String name;
        String surname;
        String license;
        String contact;
        byte points;

        short sequenceNumber;
        String countyIdentifier;
        String year;
        float engineSize;
        boolean hasPass;
        String userResponse;

        System.out.println("Enter new Driver details:");
        System.out.println("Name:");
        name = scanner.nextLine();
        System.out.println("Surname:");
        surname = scanner.nextLine();
        System.out.println("license Number:");
        license = scanner.nextLine();
        System.out.println("Contact Number:");
        contact = scanner.nextLine();
        System.out.println("License Points:");
        points = scanner.nextByte();

        System.out.println("Enter car details:");
        System.out.println("Sequence Number:");
        sequenceNumber = scanner.nextShort();
        scanner.nextLine();
        System.out.println("County Identifier:");
        countyIdentifier = scanner.nextLine();
        System.out.println("Car year manufactured:");
        year = scanner.nextLine();
        System.out.println("Engine Size:");
        engineSize = scanner.nextFloat();
        scanner.nextLine();

        do {
            System.out.println("\ntype 'yes' or 'y' for pass. Type 'no' or 'n' ");
            System.out.println("Pass NCT:");
            userResponse = scanner.nextLine();
        } while (responseProcess(userResponse) >= 3);

        Driver newDriver = prs.registerDriver(name, surname, license, contact, points);
        Car newCar = prs.registerCar(sequenceNumber, countyIdentifier, year, engineSize, hasPassed(responseProcess(userResponse)));

        System.out.println(newDriver.fullName() + " " + newDriver);
        System.out.println(newCar.getRegistrationNumber() + " " + newCar);
    }

    public boolean hasPassed(int userResponse){
        return userResponse == 1;
    }

    public int responseProcess(String userResponse){
        if (userResponse.trim().equalsIgnoreCase("yes") | userResponse.trim().equalsIgnoreCase("y")){
            return 1;
        } else if (userResponse.trim().equalsIgnoreCase("no") | userResponse.trim().equalsIgnoreCase("n")) {
            return 0;
        } else {
            return 3;
        }
    }


    public static void main(String[] args) {
        new Main();
    }
}