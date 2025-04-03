package classesAndObjects;

import java.time.LocalDateTime;

public class Flight {
	    private static int totalFlights = 0;
	    private static final String airline = "AIR INDIA";

	    private String flightNumber;
	    private String destination;
	    private LocalDateTime departureTime;
	    private LocalDateTime arrivalTime;
	    private int totalSeats;
	    private double price;

	    // Constructor
	    public Flight(String flightNumber, String airline, String origin, String destination, 
	                     LocalDateTime departureTime, LocalDateTime arrivalTime, int totalSeats, double price) {
	        this.flightNumber = flightNumber;
	        this.destination = destination;
	        this.departureTime = departureTime;
	        this.arrivalTime = arrivalTime;
	        this.totalSeats = totalSeats;
	        this.price = price;
	        totalFlights++; // Increment total flights count
	    }
	    public String getFlightNumber() { 
	    	return flightNumber; 
	    }
	    public String getAirline() {
	    	return airline;
	    }
	    public String getDestination() {
	    	return destination; 
	    }
	    public LocalDateTime getDepartureTime() {
	    	return departureTime;
	    }
	    public LocalDateTime getArrivalTime() {
	    	return arrivalTime; 
	    }
	    public int getTotalSeats() {
	    	return totalSeats;
	    }
	    public double getPrice() {
	    	return price; 
	    }
	    public void setFlightNumber(String flightNumber) { 
	    	this.flightNumber= flightNumber; 
	    }
	    public void setDestination(String destination) {
	    	this.destination = destination; 
	    }
	    public void setDepartureTime (LocalDateTime departureTime) {
	    	this.departureTime = departureTime;
	    }
	    public void setArrivalTime (LocalDateTime arrivalTime) {
	    	this.arrivalTime = arrivalTime; 
	    }
	    public void setPrice(double price) {
	    	this.price = price; 
	    }
	    public void setTotalSeats(int totalSeats) {
	    	this.totalSeats = totalSeats; 
	    }
	    public static int getTotalFlights() {
	    	return totalFlights; 
	    }
	    
	    @Override
	    public String toString() {
	        return "FlightDTO{" +
	                "flightNumber='" + flightNumber + '\'' +
	                ", airline='" + airline + '\'' +
	                ", destination='" + destination + '\'' +
	                ", departureTime=" + departureTime +
	                ", arrivalTime=" + arrivalTime +
	                ", totalSeats=" + totalSeats +
	                ", price=" + price +
	                '}';
	    }
	}
