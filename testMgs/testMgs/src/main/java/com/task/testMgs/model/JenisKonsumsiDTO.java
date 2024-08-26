package com.task.testMgs.model;

public class JenisKonsumsiDTO {

    private String id;
    private String name;
    private Double maxPrice;
    private String createdAt;

    public String getId() {
        return id;
    }

    public void setId(String string) {
        this.id = string;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Double double1) {
        this.maxPrice = double1;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String string) {
        this.createdAt = string;
    }

}

