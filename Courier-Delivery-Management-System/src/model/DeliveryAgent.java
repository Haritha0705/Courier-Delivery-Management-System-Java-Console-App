package model;

import java.util.ArrayList;
import java.util.List;

public class DeliveryAgent {
    private final String agentId;
    private String name;
    private String location;
    private String status;
    private int completedDeliveries;
    private List<Package> assignedPackages;

    //constructor
    public DeliveryAgent(String agentId,String name,String location){
        this.agentId = agentId;
        this.name = name;
        this.location = location;
        this.status = "Available";
        this.completedDeliveries = 0;
        this.assignedPackages = new ArrayList<>();
    }

    // Getters
    public String getAgentId() {
        return agentId;
    }

    public String getAgentName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public int getCompletedDeliveries() {
        return completedDeliveries;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCompletedDeliveries(int completedDeliveries) {
        this.completedDeliveries = completedDeliveries;
    }

    // Add package
    public void addPackage(Package pkg) {
        assignedPackages.add(pkg);
    }

    public List<Package> getAssignedPackages() {
        return assignedPackages;
    }

    @Override
    public String toString() {
        return "Id: " + agentId +
                ", Name: " + name +
                ", Location: " + location +
                ", Status: " + status +
                ", Completed Deliveries: " + completedDeliveries +
                ", Assigned Packages: " + assignedPackages.size();
    }
}
