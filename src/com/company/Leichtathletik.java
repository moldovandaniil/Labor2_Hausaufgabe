package com.company;

/**
 * Abstract class that implements the Sport interface
 */
public abstract class Leichtathletik implements Sport{

    /**
     *
     * @return specific time for each sport that extends this class
     */
    @Override
    public abstract double kalkuliereZeit();
}
