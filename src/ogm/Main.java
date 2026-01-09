package ogm;

import ogm.model.Equipment;
import ogm.model.EquipmentStatus;
import ogm.model.HydrocarbonType;
import ogm.model.OilFieldManager;
import ogm.model.ProductionRecord;
import ogm.model.Well;
import ogm.model.WellStatus;

public class Main{
    public static void main(String[] args) {
        OilFieldManager oilFieldManager1 = new OilFieldManager(1, "Samotlor Field", "Surgutneftegaz", "Tyumen Oblast", 1969, 3000.5);
        OilFieldManager oilFieldManager2 = new OilFieldManager(2, "Verkhnechonskoye Field", "Surgutneftegaz", "Irkutsk Oblast", 1987, 2500.0);

        Well well1 = new Well(1, "Well-001", 61.5000, 73.5000, 2500, WellStatus.ACTIVE, HydrocarbonType.OIL, "2020-03-15", "2025-11-20");
        Well well2 = new Well(2, "Well-002", 61.5050, 73.5100, 2450, WellStatus.ACTIVE, HydrocarbonType.OIL, "2020-05-10", "2025-10-15");

        Equipment equipment1 = new Equipment(1, "Centrifugal Pump A1", 1, "Pump", "2020-02-01", EquipmentStatus.OPERATIONAL, 500.0, 95.5);
        Equipment equipment2 = new Equipment(2, "Gas Compressor B2", 3, "Compressor", "2019-11-20", EquipmentStatus.MAINTENANCE, 450.0, 0.0);

        ProductionRecord productionRecord1 = new ProductionRecord(1, 1, "2026-01-01", HydrocarbonType.OIL, 125.5, 32.5, 45.2, 35.8, 0);
        ProductionRecord productionRecord2 = new ProductionRecord(2, 3, "2026-01-01", HydrocarbonType.NATURAL_GAS, 85400.0, 98.5, 55.3, 28.2, 0);

        System.out.println("Oil field manager:");
        System.out.println(oilFieldManager1);
        System.out.println(oilFieldManager2);

        System.out.println("Well:");
        System.out.println(well1);
        System.out.println(well2);

        System.out.println("Equipment:");
        System.out.println(equipment1);
        System.out.println(equipment2);

        System.out.println("Product record:");
        System.out.println(productionRecord1);
        System.out.println(productionRecord2);

        System.out.println("Available Well Status:");
        for (WellStatus wellStatus: WellStatus.values()){
            System.out.println(wellStatus);
        }

        System.out.println("Available Equipment Status:");
        for (EquipmentStatus equipmentStatus: EquipmentStatus.values()){
            System.out.println(equipmentStatus);
        }

        System.out.println("Available Hydrocarbon Types:");
        for (HydrocarbonType hydrocarbonType: HydrocarbonType.values()){
            System.out.println(hydrocarbonType);
        }

        System.out.println("Before changes:" + oilFieldManager1.getEstablishmentYear());
        oilFieldManager1.setEstablishmentYear(1980);
        System.out.println("After changes:" + oilFieldManager1.getEstablishmentYear());



    }
}