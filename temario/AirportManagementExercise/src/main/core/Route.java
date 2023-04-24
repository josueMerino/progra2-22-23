package main.core;

public class Route {
    private int airlineId;
    private int airportSourceId;
    private int airportDestinationId;
    private String codeShare;
    private int stops;

    public Route(int airlineId, int airportSourceId, int airportDestinationId, String codeShare, int stops) {
        this.airlineId = airlineId;
        this.airportSourceId = airportSourceId;
        this.airportDestinationId = airportDestinationId;
        this.codeShare = codeShare;
        this.stops = stops;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public int getAirportSourceId() {
        return airportSourceId;
    }

    public int getAirportDestinationId() {
        return airportDestinationId;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public int getStops() {
        return stops;
    }
}
