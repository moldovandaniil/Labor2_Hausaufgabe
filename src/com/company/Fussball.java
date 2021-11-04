package com.company;

/**
 * "final product" class which extends Mannschaftssport
 */
public class Fussball extends  Mannschaftssport {

    /**
     *
     * @return a concrete value, specific for this type of sport
     */
    @Override
    public double kalkuliereZeit() {
        return 65;
    }
}
