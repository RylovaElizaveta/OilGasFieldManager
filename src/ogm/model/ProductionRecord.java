package ogm.model;

public class ProductionRecord{
    private int id;
    private int wellId;
    private String recordDate;
    private HydrocarbonType hydrocarborType;
    private double volumeProduced;
    private double quality;
    private double pressure;
    private double temperature;
    private int incidents;

    public ProductionRecord(int id, int wellId, String recordDate, HydrocarbonType hydrocarborType, double volumeProduced, double quality, double pressure, double temperature, int incidents) {
        this.hydrocarborType = hydrocarborType;
        this.id = id;
        this.incidents = incidents;
        this.pressure = pressure;
        this.quality = quality;
        this.recordDate = recordDate;
        this.temperature = temperature;
        this.volumeProduced = volumeProduced;
        this.wellId = wellId;
    }

    public int getId() {
        return id;
    }

    public int getWellId() {
        return wellId;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public HydrocarbonType getHydrocarborType() {
        return hydrocarborType;
    }

    public double getVolumeProduced() {
        return volumeProduced;
    }

    public double getQuality() {
        return quality;
    }

    public double getPressure() {
        return pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getIncidents() {
        return incidents;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWellId(int wellId) {
        this.wellId = wellId;
    }

    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    public void setHydrocarborType(HydrocarbonType hydrocarborType) {
        this.hydrocarborType = hydrocarborType;
    }

    public void setVolumeProduced(double volumeProduced) {
        this.volumeProduced = volumeProduced;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setIncidents(int incidents) {
        this.incidents = incidents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductionRecord{");
        sb.append("id=").append(id);
        sb.append(", wellId=").append(wellId);
        sb.append(", recordDate=").append(recordDate);
        sb.append(", hydrocarborType=").append(hydrocarborType);
        sb.append(", volumeProduced=").append(volumeProduced);
        sb.append(", quality=").append(quality);
        sb.append(", pressure=").append(pressure);
        sb.append(", temperature=").append(temperature);
        sb.append(", incidents=").append(incidents);
        sb.append('}');
        return sb.toString();
    }
}