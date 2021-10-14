package com.company;
import static org.junit.Assert.assertEquals;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void mainTest()
    {
        //setting test parameters and values
        List<Sport> l1 = new ArrayList<Sport>();
        Sport s1 = new Fussball();
        Sport s2 = new Hochsprung();
        Sport s3 = new Fussball();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        Benutzer b1 = new Benutzer("Andrei", "Maruta", l1);

        //assertEquals tests
        assertEquals(150.0, b1.kalkuliereZeit(), 0.0);
        assertEquals(130.0, b1.kalkuliereZeit(new Fussball()), 0.0);
        assertEquals(50.0, b1.kalkuliereDurschnittzeit(), 0.0);

    }


}
