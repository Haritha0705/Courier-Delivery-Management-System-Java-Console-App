package ui;

import model.DeliveryAgent;
import model.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgentPanel {

    private static List<Package> packages = new ArrayList<>();

    public static void ViewAssignedPackages(Scanner scanner){
        System.out.println("Enter your Id");
        String id = scanner.next();

        boolean found = false;

        for (Package p : packages){
            DeliveryAgent agent = p.getAssignedAgent();


            if (agent != null && agent.getAgentId().equals(id)) {
                found = true;
                System.out.println("Package ID: " + p.getPackageId());
                System.out.println("Sender: " + p.getSenderName());
                System.out.println("Receiver: " + p.getReceiverName());
                System.out.println("Address: " + p.getAddress());
                System.out.println("Weight: " + p.getWeight());
                System.out.println("Type: " + p.getType());
                System.out.println("Status: " + p.getStatus());
                System.out.println("Assigned Agent: " + agent.getAgentName() + " (" + agent.getAgentId() + ")");
                System.out.println("-----------------------------------");
            } else {
                System.out.println("Assigned Agent: None");
            }
            System.out.println("-----------------------------");
        }
        if (!found){
            System.out.println("No packages assigned to Agent ID: " + id);
        }
    }
}
