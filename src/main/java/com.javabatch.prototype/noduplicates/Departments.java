package com.javabatch.prototype.noduplicates;

/**
 * Author: Frank Hinkel
 */
public enum Departments {

    LEGAL_COSTS ("LC"),

    LIFE ("LF"),

    FIRE_MATERIAL_DAMAGE ("FM"),

    UNKNOWN ("UN");

    private String depName;

    private Departments(String depName) {
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }
}
