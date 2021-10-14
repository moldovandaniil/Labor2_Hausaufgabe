package com.company;

import java.util.List;

public class Benutzer {

    String vorName;
    String nachName;
    List<Sport> sport;

    //constructor
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    //getters and setters
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

    //calculate the total time of all sports
    public double kalkuliereZeit()
    {
        double sum = 0;

        for(Sport i : sport)
        {
            sum+=i.kalkuliereZeit();
        }
        return sum;
    }

    //calculate the total time of a certain type of sport
    public double kalkuliereZeit(Sport s)
    {
        double sum = 0;

        for(Sport i : sport)
        {
            if(i.kalkuliereZeit() == s.kalkuliereZeit())
            {
                sum+=i.kalkuliereZeit();
            }
        }
        return sum;
    }

    public double kalkuliereDurschnittzeit()
    {
        double sum = 0;
        double count = 0;


        for(Sport i : sport)
        {
            count++;
            sum+=i.kalkuliereZeit();
        }
        return sum/count;
    }


}
