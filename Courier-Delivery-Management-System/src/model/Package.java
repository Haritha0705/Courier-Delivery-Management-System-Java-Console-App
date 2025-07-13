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

    // Getters
    public String getPackageId() {
        return packageId;
    }

    public String getSenderName() {
        return senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getAddress() {
        return address;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public DeliveryAgent getAssignedAgent() {
        return assignedAgent;
    }

    // Setters
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssignedAgent(DeliveryAgent assignedAgent) {
        this.assignedAgent = assignedAgent;
    }

    @Override
    public String toString() {
        return "Package ID: " + packageId +
                ", Sender: " + senderName +
                ", Receiver: " + receiverName +
                ", Address: " + address +
                ", Weight: " + weight +
                ", Type: " + type +
                ", Status: " + status +
                ", Agent ID: " + (assignedAgent != null ? assignedAgent.getAgentId() : "None");
    }
}
