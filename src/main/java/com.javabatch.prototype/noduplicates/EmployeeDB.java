package com.javabatch.prototype.noduplicates;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Frank Hinkel
 */
public class EmployeeDB {

    public static Map<String, Departments> employeeMap = new HashMap<String, Departments>();

    static {
        employeeMap.put("max.mueller@mail.com", Departments.LIFE);
        employeeMap.put("dieter.immerda@mail.com", Departments.LIFE);
        employeeMap.put("fritz.froh@mail.com", Departments.FIRE_MATERIAL_DAMAGE);
        employeeMap.put("andi.arbeit@mail.com", Departments.LEGAL_COSTS);
    }
}
