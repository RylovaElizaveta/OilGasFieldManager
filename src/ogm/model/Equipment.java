package ogm.model;

public class Equipment{
    private int id;
    private String name;
    private int wellId;
    private String type;
    private String installationDate;
    private EquipmentStatus status;
    private double capacity;
    private double utilizationRate;

    public Equipment(int id, String name,  int wellId, String type, String installationDate,  EquipmentStatus status, double capacity, double utilizationRate) {
        this.capacity = capacity;
        this.id = id;
        this.installationDate = installationDate;
        this.name = name;
        this.status = status;
        this.type = type;
        this.utilizationRate = utilizationRate;
        this.wellId = wellId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWellId() {
        return wellId;
    }

    public String getType() {
        return type;
    }

    public String getInstallationDate() {
        return installationDate;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getUtilizationRate() {
        return utilizationRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWellId(int wellId) {
        this.wellId = wellId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setInstallationDate(String installationDate) {
        this.installationDate = installationDate;
    }

    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setUtilizationRate(double utilizationRate) {
        this.utilizationRate = utilizationRate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipment{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", wellId=").append(wellId);
        sb.append(", type=").append(type);
        sb.append(", installationDate=").append(installationDate);
        sb.append(", status=").append(status);
        sb.append(", capacity=").append(capacity);
        sb.append(", utilizationRate=").append(utilizationRate);
        sb.append('}');
        return sb.toString();
    }

    
}