package com.qa.homework.interfaces;

import com.qa.homework.models.Equipment;
import com.qa.homework.models.Client;

public interface IActionsWithEquipment {
    String getEquipmentForFixing(Equipment equipment, Client client)throws Exception ;

}
