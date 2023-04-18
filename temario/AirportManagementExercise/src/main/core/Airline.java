package main.core;

public class Airline {
    private int id;
    private String name;
    private String alias;
    private String country;
    private boolean active;

    public Airline(int id, String name, String alias, String country, boolean active) {
        this.id = id;
        this.name = name;
        this.alias = alias;
        this.country = country;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getCountry() {
        return country;
    }

    public boolean isActive() {
        return active;
    }
}
