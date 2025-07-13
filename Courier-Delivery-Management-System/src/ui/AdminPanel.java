package ui;

import model.DeliveryAgent;
import model.Package;

import java.util.*;

public class AdminPanel {
    private static List<DeliveryAgent> deliveryAgents = new ArrayList<>();
    private static List<Package> packages = new ArrayList<>();

    public static void addDeliveryAgent(Scanner scanner){
        System.out.println("Enter DeliveryAgent ID");
        String id = scanner.next();
        System.out.println("Enter DeliveryAgent Name");
        String name = scanner.next();
        System.out.println("Enter DeliveryAgent Location");
        String location = scanner.next();

        deliveryAgents.add(new DeliveryAgent(id,name,location));
        System.out.println("Delivery Agent added successfully.");
    }

    public static void viewAllAgents(){
        if (deliveryAgents.isEmpty()){
            System.out.println("No Delivery Agents");
            return;
        }
        for (DeliveryAgent d : deliveryAgents){
            System.out.println(d.toString());
        }
    }

    public static void addPackage(Scanner scanner){
        System.out.println("Enter Package ID");
        String id = scanner.next();

        System.out.println("Enter sender Name :");
        String senderName = scanner.next();

        System.out.println("Enter receiver Name :");
        String receiverName = scanner.next();

        System.out.println("Enter address :");
        String address = scanner.next();

        System.out.println("Enter weight :");
        double weight = scanner.nextDouble();

        System.out.println("Enter type :");
        String type = scanner.next();

        System.out.println("Enter status :");
        String status = scanner.next();

        System.out.println("Enter the Delivery Agent ID:");
        for (DeliveryAgent d : deliveryAgents){
            System.out.println(d.getAgentId()+" | "+d.getAgentName());
        }
        String agentId = scanner.next();
        DeliveryAgent assignedAgent = null;
        for (DeliveryAgent d : deliveryAgents){
            if (d.getAgentId().equals(agentId)){
                assignedAgent=d;
                break;
            }
        }
        if (assignedAgent != null){
            System.out.println("Agent Found: " + assignedAgent.getAgentId() +" | " + assignedAgent.getAgentName());
            Package newPackage = new Package(id,senderName,receiverName,address,weight,type,status,assignedAgent);
            packages.add(newPackage);
            assignedAgent.addPackage(newPackage);
            System.out.println("Package created and assigned to agent successfully.");
        }else {
            System.out.println("Agent not found! Package not created.");
        }
    }

    public static void viewAllPackages(){
        if (packages.isEmpty()){
            System.out.println("No Packages Found!");
            return;
        }
        for (Package p : packages){
            System.out.println(p.toString());
        }
    }

    public static void updatePackage(Scanner scanner){
        System.out.print("Enter Package ID to update: ");
        String id = scanner.nextLine();

        for (Package p : packages){
            if (p.getPackageId().equals(id)){
                System.out.println("Enter new Status");
                p.setStatus(scanner.nextLine());

                System.out.println("Package updated.");
                return;
            }
        }
        System.out.println("Package not found.");
    }

    public static void viewStatistics(){
        if (packages.isEmpty()) {
            System.out.println("No packages available to show statistics.");
            return;
        }

        Map<String,Integer> typeCount = new HashMap<>();
        Map<String,Integer> statusCount = new HashMap<>();

        for (Package p : packages){

            // Count by Type
            String type = p.getType();
            typeCount.put(type,typeCount.getOrDefault(type,0)+1);

            // Count by Status
            String status = p.getStatus();
            statusCount.put(status,statusCount.getOrDefault(status,0)+1);
        }

        System.out.println("\n Package Statistics:");
        System.out.println("\n By Type:");
        for (Map.Entry<String,Integer>entry : typeCount.entrySet()){
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n By Status:");
        for (Map.Entry<String,Integer>entry : statusCount.entrySet()){
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }

    }



}
