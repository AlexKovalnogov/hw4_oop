package com.qa.interfaces;

import com.qa.models.Equipment;
import com.qa.models.Client;

public interface IActionsWithEquipment {
    String getEquipmentForFixing(Equipment equipment, Client client)throws Exception ;

}
