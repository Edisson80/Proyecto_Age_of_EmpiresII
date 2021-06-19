package com.df.proyecto_age_of_empiresii.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Civilization implements Serializable {

    @SerializedName("id")
    private String idCivilization;

    @SerializedName("name")
    private String nameCivilization;

    public String expansion;
    public String army_type;
    public String team_bonus;

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getArmy_type() {
        return army_type;
    }

    public void setArmy_type(String army_type) {
        this.army_type = army_type;
    }

    public String getTeam_bonus() {
        return team_bonus;
    }

    public void setTeam_bonus(String team_bonus) {
        this.team_bonus = team_bonus;
    }

    public String getIdCivilization() {
        return idCivilization;
    }

    public String getNameCivilization() {
        return nameCivilization;
    }

    public void setNameCivilization(String nameCivilization) { this.nameCivilization = nameCivilization;}

    public void setIdCivilization(String idCivilization) {
        this.idCivilization = idCivilization;
    }
}

