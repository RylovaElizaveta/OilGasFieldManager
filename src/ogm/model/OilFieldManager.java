package ogm.model;

public class OilFieldManager{
    private int id;
    private String name;
    private String operator;
    private String region;
    private int establishmentYear;
    private double totalReserves;

    public OilFieldManager(int id, String name, String operator, String region, int establishmentYear, double totalReserves) {
        this.establishmentYear = establishmentYear;
        this.id = id;
        this.name = name;
        this.operator = operator;
        this.region = region;
        this.totalReserves = totalReserves;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return operator;
    }

    public String getRegion() {
        return region;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public double getTotalReserves() {
        return totalReserves;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public void setTotalReserves(double totalReserves) {
        this.totalReserves = totalReserves;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OilFieldManager{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", operator=").append(operator);
        sb.append(", region=").append(region);
        sb.append(", establishmentYear=").append(establishmentYear);
        sb.append(", totalReserves=").append(totalReserves);
        sb.append('}');
        return sb.toString();
    }
}