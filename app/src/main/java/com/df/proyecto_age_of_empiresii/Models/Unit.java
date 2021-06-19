package com.df.proyecto_age_of_empiresii.Models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Unit implements Serializable {
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;

    public String description;
    public String expansion;
    public String age;
    public String created_in;
    public int build_time;
    public double reload_time;
    public double attack_delay;
    public double movement_rate;
    public int line_of_sight;
    public int hit_points;
    public int attack;
    public String armor;
    public String accuracy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCreated_in() {
        return created_in;
    }

    public void setCreated_in(String created_in) {
        this.created_in = created_in;
    }

    public int getBuild_time() {
        return build_time;
    }

    public void setBuild_time(int build_time) {
        this.build_time = build_time;
    }

    public double getReload_time() {
        return reload_time;
    }

    public void setReload_time(double reload_time) {
        this.reload_time = reload_time;
    }

    public double getAttack_delay() {
        return attack_delay;
    }

    public void setAttack_delay(double attack_delay) {
        this.attack_delay = attack_delay;
    }

    public double getMovement_rate() {
        return movement_rate;
    }

    public void setMovement_rate(double movement_rate) {
        this.movement_rate = movement_rate;
    }

    public int getLine_of_sight() {
        return line_of_sight;
    }

    public void setLine_of_sight(int line_of_sight) {
        this.line_of_sight = line_of_sight;
    }

    public int getHit_points() {
        return hit_points;
    }

    public void setHit_points(int hit_points) {
        this.hit_points = hit_points;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }
}

