package com.company;

import java.util.List;

/**
 * A class for the details of an user, as well as specific calculateTime methods
 */
public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;


    /**
     * constructor
     * @param vorName name of the user
     * @param nachName surname of the user
     * @param sport the list of sports he practices
     */
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /**
     * getters and setters
     * @return the values
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
     * Calcultes the total time the user spends on sports
     * @return total time of all sports
     */
    public double kalkuliereZeit()
    {
        double sumOfHours = 0;

        for(Sport i : sport)
        {
            sumOfHours+=i.kalkuliereZeit();
        }
        return sumOfHours;
    }

    /**
     * calculate the time spent on a certain type of sport
     * @param sportType the specified type of sport
     * @return time spent on a certain type of sport
     */
    public double kalkuliereZeit(Sport sportType)
    {
        double sumOfHours = 0;

        for(Sport i : sport)
        {
            if(i.kalkuliereZeit() == sportType.kalkuliereZeit())
            {
                sumOfHours+=i.kalkuliereZeit();
            }
        }
        return sumOfHours;
    }

    /**
     * Calculate average time spent on sports
     * @return average time spent on sports
     */
    public double kalkuliereDurschnittzeit()
    {
        double sumOfHours = 0;
        double countOfSports = 0;


        for(Sport i : sport)
        {
            countOfSports++;
            sumOfHours+=i.kalkuliereZeit();
        }
        return sumOfHours/countOfSports;
    }


}
