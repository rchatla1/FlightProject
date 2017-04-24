package gsu.edu.cis.programs;
import java.util.Date;

public class Adminstrator extends Customer {
	    

	    public Administrator(String firstName, String lastName, String address, int zipCode, String state,
	   		 String username, String password, String email, long SSN, String id){
	   	 super(firstName, lastName, address, zipCode, state, username, password, email, SSN, id);
	    }
	    
	    public Flight createFlight(String departureCity, String arrivalCity, Date departureTime,
	   		 Date arrivalTime, int flightNumber, int capacity) throws Exception{
	   	 //check if flight already exists - throw exception
	   	 
	    }
	    
	    public void updateDepartureCity(Flight flight, String departureCity){
	   	 flight.setDepartureCity(departureCity);
	   	 
	    }
	    
	    public void updateArrivalCity(Flight flight, String arrivalCity){
	   	 flight.setArrivalCity(arrivalCity);
	   	 
	    }
	    
	    public void updateDepartureTime(Flight flight, Date departureTime){
	   	 flight.setDepartureTime(departureTime);
	   	 
	    }
	    
	    public void updateArrivalTime(Flight flight, Date arrivalTime){
	   	 flight.setDepartureTime(arrivalTime);
	   	 
	    }
	    
	    public void updateFlightNumber(Flight flight, int flightNumber){
	   	 flight.setFlightNumber(flightNumber);
	   	 
	    }
	    
	    public void updateCapacity(Flight flight, int capacity){
	   	 flight.setCapacity(capacity);
	   	 
	    }
	    
	    public boolean deleteFlight(Flight flight) throws Exception{
	   	 // should check if we have reservations if not throw exception
	   	
	    }    
	}




