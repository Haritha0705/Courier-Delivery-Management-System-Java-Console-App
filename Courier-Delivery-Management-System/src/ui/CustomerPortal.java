package ui;

import model.DeliveryAgent;
import model.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerPortal {
    private static List<Package> packages = new ArrayList<>();
    private static List<DeliveryAgent> deliveryAgents = new ArrayList<>();

    public static void SearchPackageID(Scanner scanner){
        System.out.println("Enter Package Id");
        String id = scanner.next();

        for (Package p : packages){
            System.out.println("Package ID: " + p.getPackageId());
            System.out.println("Sender: " + p.getSenderName());
            System.out.println("Receiver: " + p.getReceiverName());
            System.out.println("Address: " + p.getAddress());
            System.out.println("Weight: " + p.getWeight());
            System.out.println("Type: " + p.getType());
            System.out.println("Status: " + p.getStatus());
            System.out.println("-----------------------------------");
            return;
        }
        System.out.println("Package not found.");
    }
}
