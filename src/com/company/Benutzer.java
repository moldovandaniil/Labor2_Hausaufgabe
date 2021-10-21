package com.company;

import java.util.List;

/**
* User Class (Benutzer)
*/

public class Benutzer {
    /**
    * Initialize the variables for the constructor
    */
    String vorName;
    String nachName;
    List<Sport> sport;
    
    /**
    * Constructor
    */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }
    
    
    /**
    * Getters and setters
    */
    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }
    
    /**
    * Calculate the total time
    *   spent on all the types of sport
    */
    public double kalkuliereZeit(){
        double sum = 0;

        for(Sport i : sport){
            sum+=i.kalkuliereZeit();                     /*Iterate through all the sports and use add the time in a "sum" counter */
        }
        return sum;     /*Return the sum*/
    }
    
    /**
    * Calculate the total time
    *   spent on a specific type of sport
    */
    public double kalkuliereZeit(Sport s)                   /*Give the sport type as a parameter*/
    {
        double sum = 0;

        for(Sport i : sport){
            
            if(i.kalkuliereZeit() == s.kalkuliereZeit()){    /*This way we verify if the iterated sport from the list is the same type as param. */
                sum+=i.kalkuliereZeit();
            }
        }
        return sum;
    }

    
    
     /**
    * Calculate the total time
    *   and do the average
    */
    public double kalkuliereDurschnittzeit()
    {
        double sum = 0;
        double count = 0;

        for(Sport i : sport){
            count++;
            sum+=i.kalkuliereZeit();
        }
        return sum/count;
    }


}
