package com.qa.models;

import org.apache.log4j.Logger;

public class Equipment {

    private Logger loger = Logger.getLogger(Equipment.class);

    public String equipmentId;
    private double equipmentPrice;
    private String equipmentCondition;
    private String equipmentDateOfBuying;

    public Equipment() {

    }

    public Equipment(String equipmentId, double equipmentPrice, String equipmentCondition, String equipmentDateOfBuying) {
        this.equipmentId = equipmentId;
        this.equipmentPrice = equipmentPrice;
        this.equipmentCondition = equipmentCondition;
        this.equipmentDateOfBuying = equipmentDateOfBuying;
    }

    public double getEquipmentPrice() {
        return equipmentPrice;
    }

    public String getEquipmentCondition() {
        return equipmentCondition;
    }

    public String getEquipmentDateOfBuying() {
        return equipmentDateOfBuying;
    }
}
