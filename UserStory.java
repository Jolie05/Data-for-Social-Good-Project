import java.util.Scanner;

/* 
 * This represents the story we create and how we're going
 * to answer the questions we created
 */
public class UserStory {

  private Event [] fieldEvents; //our 1D array of events

//To give the fieldEvents a 1D array
  public UserStory(String eventNameFile, String countryFile, String placementFile, String yearFile) {
    this.fieldEvents = createEvents(eventNameFile, countryFile, placementFile, yearFile);
  }

//This creates a data type with all the information here
  public Event[] createEvents(String eventNameFile, String countryFile, String placementFile, String yearFile) {
    String[] events = FileReader.toStringArray(eventNameFile);
    String[] countries = FileReader.toStringArray(countryFile);
    String[] placements = FileReader.toStringArray(placementFile);
    int[] years = FileReader.toIntArray(yearFile);
    
    Event[] eventArray = new Event[events.length];
    for (int i = 0; i < events.length; i++) {
      eventArray[i] = new Event(events[i], countries[i], placements[i], years[i]);
    }
    
    return eventArray;
  }

/*
 *This method is to answer our first question and second question:
 * How many gold and silver medals did the USA get in total?
 *Finds all the times the country wanted was mentioned, then-
 *looks through and see's if it matches the wanted medals.
 */
public int findCountryByMedals(String country, String medal){
  int medals = 0;
  for (int i = 0; i < fieldEvents.length; i++){
    if(fieldEvents[i].getCountry().equals(country)){ //for the country
      if (fieldEvents[i].getPlacement().equals(medal)) { //for the year
        medals++;
      }
    }
  }
  return medals;
  
}

/*
 *This method is to answer our third question:
 * How many medals did the USA get in total in the 2000 Olympic Games?
 *This method goes through the list and finds all the times that the-
 *wanted country is mentioned in, then sees if the year matches what-
 *we're looking for.
 */
public int findNumberOfMedalsByYear(String country, int year){
  int count = 0;
  for (int i = 0; i < fieldEvents.length; i++){
    if(fieldEvents[i].getCountry().equals(country)){ //for the country
      if (fieldEvents[i].getYear() == year) { //for the year
        count++;
      }
    }
  }
  return count;
}
  
 //Initalizes the fieldEvents into a 1D array of event objects
    public String toString() {
    String result = "All Events:\n";
    for (Event event : fieldEvents) {
      result += event + "\n";
    }
    return result;
  }
  
}