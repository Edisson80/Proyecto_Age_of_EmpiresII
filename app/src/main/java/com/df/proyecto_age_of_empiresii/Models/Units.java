package com.df.proyecto_age_of_empiresii.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Units {
    @SerializedName("units")
    List<Unit> unitList;

    public List<Unit> getUnitList() {
        return unitList;
    }

    public void setUnitList(List<Unit> unitList) {
        this.unitList = unitList;
    }

}


