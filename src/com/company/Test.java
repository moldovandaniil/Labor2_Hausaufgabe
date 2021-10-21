package com.company;

/**
* Importing junit for assert tests
*/ 
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
* Importing Java Collections for List usage
*/ 
import java.util.ArrayList;
import java.util.List;



public class Test {

    @org.junit.Test
    public void mainTest()
    {
        /**
        * Creating test instances of each class
        */ 
        
        List<Sport> l1 = new ArrayList<Sport>();
        Sport s1 = new Fussball();
        Sport s2 = new Hochsprung();
        Sport s3 = new Fussball();
        
        l1.add(s1);                                                        /* Adding to the list the created sports*/
        l1.add(s2);
        l1.add(s3);
        
        Benutzer b1 = new Benutzer("Andrei", "Maruta", l1);                /*Creating an user */

        /**
        * Testing the overall functionality with assert tests
        */
        assertEquals(150.0, b1.kalkuliereZeit(), 0.0);                     //True
        assertEquals(130.0, b1.kalkuliereZeit(new Fussball()), 0.0);       //True
        assertEquals(50.0, b1.kalkuliereDurschnittzeit(), 0.0);            //True

    }


}
