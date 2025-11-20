import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

UserStory olympic = new UserStory("eventName.txt", "country.txt", "placements.txt", "year.txt");

//Our first question:
System.out.println("How many gold medals did the USA get?");
System.out.println("The USA got a total of " + olympic.findCountryByMedals("United States", "Gold") + " gold medals!");
System.out.println("");
    
//Our second question:
System.out.println("How many silver medals did the USA get?");
System.out.println("The USA got a total of " + olympic.findCountryByMedals("United States", "Silver") + " silver medals!");
System.out.println("");

//Our third question:
System.out.println("How many medals did the USA get in total during the 2000 Olympic games?");
System.out.println("The USA got a total of " + olympic.findNumberOfMedalsByYear("United States", 2000) + " medals!");
System.out.println("");
    
  }
}