package com.Game_Product;

import java.util.Objects;

public class One_Unit {

    private long id;
    private double price;

    private String name;
    private String annotation;
    private String details;

    public One_Unit(long id, double price, String name, String annotation, String details) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.annotation = annotation;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof One_Unit)) return false;
        One_Unit one_unit = (One_Unit) o;
        return getId() == one_unit.getId() &&
                Objects.equals(getName(), one_unit.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }



}
