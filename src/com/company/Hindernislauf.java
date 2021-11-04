package com.company;

/**
 * "final product" class which extends Leichtathletik
 */
public class Hindernislauf extends Leichtathletik{

    /**
     *
     * @return a concrete value, specific for this type of sport
     */
    @Override
    public double kalkuliereZeit() {
        return 30;
    }
}
