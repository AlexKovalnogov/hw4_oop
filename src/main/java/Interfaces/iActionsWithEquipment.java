package Interfaces;

import Equipment.Equipment;
import InstanceModels.Client;

public interface iActionsWithEquipment {
    String getEquipmentForFixing(Equipment equipment, Client client) throws Exception;

}
