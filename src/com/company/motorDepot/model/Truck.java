package com.company.motorDepot.model;

public class Truck implements Service {
    private Long id;
    private String name;
    private String driverName;
    private State state;

    public Truck() {
    }

    public Truck(Long id, String name, String driverName, State state) {
        this.id = id;
        this.name = name;
        this.driverName = driverName;
        this.state = state;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driverName='" + driverName + '\'' +
                ", state=" + state +
                '}';
    }
}
