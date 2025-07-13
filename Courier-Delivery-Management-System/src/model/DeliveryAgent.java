package model;

import java.util.List;

public class DeliveryAgent {
    private final String agentId;
    private String name;
    private String location;
    private String status;
    private int completedDeliveries;
    private List<Package> assignedPackages;

    //constructor
    public DeliveryAgent(String agentId,String name,String location,String status,int completedDeliveries,List<Package> assignedPackages){
        this.agentId=agentId;
        this.name=name;
        this.location=location;
        this.status=status;
        this.completedDeliveries=completedDeliveries;
        this.assignedPackages=assignedPackages;
    }

    //crete getter and setters
    public String getAgentId(){
        return agentId;
    }

    public String setName(String name){
        this.name=name;
        return name;
    }

    public String setLocation(String location){
        this.location=location;
        return location;
    }

    public String setStatus(String status){
        this.status=status;
        return status;
    }

    public int setCompletedDeliveries(int completedDeliveries){
        this.completedDeliveries=completedDeliveries;
        return completedDeliveries;
    }

    public List<Package> setAssignedPackages(List<Package> assignedPackages){
        this.assignedPackages=assignedPackages;
        return assignedPackages;
    }

    @Override
    public String toString(){
        return "Id: " + agentId + ", Name: " + name + ", Location: " + location + ", Status: " + status + ", Completed Deliveries: " + completedDeliveries + ", Assigned Packages: " + assignedPackages;
    }
}
