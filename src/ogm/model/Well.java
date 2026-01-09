package ogm.model;

public class Well{
    private int id;
    private String name;
    private double latitude; 
    private double longitude;
    private int depth;
    private WellStatus status;
    private HydrocarbonType hydrocarborType;
    private String productionStartDate;
    private String lastMaintenanceDate;

    public Well( int id, String name, double latitude, double longitude, int depth, WellStatus status, HydrocarbonType hydrocarborType, String productionStartDate, String lastMaintenanceDate) {
        this.depth = depth;
        this.hydrocarborType = hydrocarborType;
        this.id = id;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.productionStartDate = productionStartDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getDepth() {
        return depth;
    }

    public WellStatus getStatus() {
        return status;
    }

    public HydrocarbonType getHydrocarborType() {
        return hydrocarborType;
    }

    public String getProductionStartDate() {
        return productionStartDate;
    }

    public String getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setStatus(WellStatus status) {
        this.status = status;
    }

    public void setHydrocarborType(HydrocarbonType hydrocarborType) {
        this.hydrocarborType = hydrocarborType;
    }

    public void setProductionStartDate(String productionStartDate) {
        this.productionStartDate = productionStartDate;
    }

    public void setLastMaintenanceDate(String lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Well{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", depth=").append(depth);
        sb.append(", status=").append(status);
        sb.append(", hydrocarborType=").append(hydrocarborType);
        sb.append(", productionStartDate=").append(productionStartDate);
        sb.append(", lastMaintenanceDate=").append(lastMaintenanceDate);
        sb.append('}');
        return sb.toString();
    }

    
    
}