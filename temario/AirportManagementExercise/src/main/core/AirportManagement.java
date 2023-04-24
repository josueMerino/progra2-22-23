package main.core;

import main.utils.FileHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirportManagement {
    private List<Airport> airports;
    private List<Airline> airlines;
    private List<Route> routes;

    public AirportManagement() throws IOException {
        this.getDataForAirports();
        this.getDataForAirlines();
        this.getDataForRoutes();
    }

    private void getDataForRoutes() throws IOException {
        FileHandler file = new FileHandler();

        this.routes = new ArrayList<>();

        List<String> data = file.read("main/data/routes.dat");

        for (String dataLine: data) {
            String[] line = dataLine.split(",");
            Route r = new Route(Integer.parseInt(line[1]), Integer.parseInt(line[3]), Integer.parseInt(line[5]), line[6], Integer.parseInt(line[7]));
            this.routes.add(r);
        }
    }

    private void getDataForAirlines() throws IOException {
        FileHandler file = new FileHandler();

        this.airlines = new ArrayList<>();

        List<String> data = file.read("main/data/airlines.dat");

        for (String dataLine: data) {
            String[] line = dataLine.split(",");
            boolean isActive = line[7] == "Y" ? true : false;
            Airline air = new Airline(Integer.parseInt(line[0]), line[1], line[2], line[6], isActive);
            this.airlines.add(air);
        }
    }

    private void getDataForAirports() throws IOException {
        FileHandler file = new FileHandler();

        this.airports = new ArrayList<>();

        List<String> data = file.read("main/data/airports.dat");

        for (String dataLine: data) {
            String[] line = dataLine.split(",");
            Airport apt = new Airport(Integer.parseInt(line[0]), line[1], line[2], line[3]);
            this.airports.add(apt);
        }
    }


}
