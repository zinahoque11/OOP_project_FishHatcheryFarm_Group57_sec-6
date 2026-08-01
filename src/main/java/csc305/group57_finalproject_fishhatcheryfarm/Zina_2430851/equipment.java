package csc305.group57_finalproject_fishhatcheryfarm.Zina_2430851;

import java.io.Serializable;

public class equipment implements Serializable {
    private String equipmentType, warrantyPeriod, condition;
    private boolean ifItsDamaged;
    private float quantity, unitPrice;

    public equipment(String equipmentType, String warrantyPeriod, String condition, boolean ifItsDamaged, float quantity, float unitPrice) {
        this.equipmentType = equipmentType;
        this.warrantyPeriod = warrantyPeriod;
        this.condition = condition;
        this.ifItsDamaged = ifItsDamaged;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isIfItsDamaged() {
        return ifItsDamaged;
    }

    public void setIfItsDamaged(boolean ifItsDamaged) {
        this.ifItsDamaged = ifItsDamaged;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "equipment{" +
                "equipmentType='" + equipmentType + '\'' +
                ", warrantyPeriod='" + warrantyPeriod + '\'' +
                ", condition='" + condition + '\'' +
                ", ifItsDamaged=" + ifItsDamaged +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
