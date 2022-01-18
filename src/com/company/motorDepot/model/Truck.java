package com.company.motorDepot.model;

import java.util.Random;

import static com.company.motorDepot.model.State.*;

public class Truck {
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

    public void changeDriver(Driver driver) {
        switch (state) {
            case BASE -> {
                if (driverName != null) {
                    this.driverName = driver.getName();
                    System.out.println("Теперь грузовик " + name + ", ведёт водитель " + driver.getName());
                } else {
                    this.driverName = driver.getName();
                    System.out.println("new driver = " + driver.getName() + " to truck " + name);
                }
            }
            case ROUTE -> {
                System.err.println("Грузовик в пути, невозможно сменить водителя.");
            }
            case REPAIR -> {
                System.err.println("Нельзя сменить водителя");
            }
        }

    }

    public void startDriving() {
        switch (state) {
            case BASE -> {
                if (!(driverName == null)) {
                    this.state = ROUTE;
                    System.out.println("успешно вышли на маршрут.");
                }
            }
            case ROUTE -> {
                System.err.println("Грузовик уже в пути");
            }
            case REPAIR -> {
                Random random = new Random();
                switch (random.nextInt(2)){
                    case 0 -> state = BASE;
                    case 1 -> state = ROUTE;
                }
                System.out.println("truck is on " + state);
            }
        }


    }
     public void startRepair(){
        switch (state) {
            case BASE, ROUTE -> {
                this.state = REPAIR;
                System.out.println("na remont -> " + name);
            }
            case REPAIR -> {
                System.err.println("Уже в ремонте");
            }
        }
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
