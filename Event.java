import java.util.Scanner;

//This represents where we format what team, who won the event etc
  public class Event {

    private String event;
    private String country;
    private String placement;
    private int year;
    

//Initalizes all the instance variables into one thing
  public Event(String event, String country, String placement, int year) {
    this.event = event;
    this.country = country;
    this.placement = placement;
    this.year = year;
}

//Gets the event
  public String getEvent() {
    return event;
  }

//Gets the name of the country
  public String getCountry() {
    return country;
  }

//Gets the placement
  public String getPlacement() {
    return placement;
  }
    
//Gets the year the event took place
  public int getYear(){
    return year;
  }

/*
 *Overriding the toString
 *Format: ______ has ___ metals in the ____ in _____! 
 */
  public String toString(){
    return country + " has " + placement + " metals in the " + event + " in " + year + "!";
  }

    
}