package model;

public class Package {
    private final String packageId;
    private String senderName;
    private String receiverName;
    private String address;
    private double weight;
    private String type;
    private String status;
    private DeliveryAgent assignedAgent;

    //constructor
    public Package(String packageId, String senderName, String receiverName, String address, double weight, String type, String status, DeliveryAgent assignedAgent){
        this.packageId = packageId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.address = address;
        this.weight = weight;
        this.type = type;
        this.status = status;
        this.assignedAgent = assignedAgent;
    }

    //crete getter and setters
    public String getPackageId(){
        return packageId;
    }
    public String setSenderName(String senderName){
        this.senderName=senderName;
        return senderName;
    }
    public String setReceiverName(String receiverName){
        this.receiverName=receiverName;
        return receiverName;
    }

    public String setAddress(String address){
        this.address=address;
        return address;
    }
    public double setWeight(double weight){
        this.weight=weight;
        return weight;
    }

    public String setType(String type){
        this.type=type;
        return type;
    }
    public String setStatus(String status){
        this.status=status;
        return status;
    }
    public DeliveryAgent setAssignedAgent(DeliveryAgent assignedAgent){
        this.assignedAgent=assignedAgent;
        return assignedAgent;
    }

}
