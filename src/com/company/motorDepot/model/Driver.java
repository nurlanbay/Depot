package com.company.motorDepot.model;

public class Driver {
    private Long id;
    private String name;
    private String bus;

    public Driver() {
    }

    public Driver(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Driver(Long id, String name, String bus) {
        this.id = id;
        this.name = name;
        this.bus = bus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
