package test;
import static org.junit.Assert.assertEquals;

import com.company.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Class for tests
 */
public class Test {

    @org.junit.Test
    public void mainTest()
    {
        //create a arraylist for all the practiced sports
        List<Sport> listOfSports = new ArrayList<Sport>();

        //create sport sessions
        Sport footballSession1 = new Fussball();
        Sport hochsprungSession1 = new Hochsprung();
        Sport footballSession2 = new Fussball();
        Sport basketballSession1 = new Basketball();

        //add the sports to the arraylist
        listOfSports.add(footballSession1);
        listOfSports.add(footballSession2);
        listOfSports.add(basketballSession1);
        listOfSports.add(hochsprungSession1);

        //create a user
        Benutzer andreiMarutaUser = new Benutzer("Andrei", "Maruta", listOfSports);

        //assertEquals tests
        assertEquals(205.0, andreiMarutaUser.kalkuliereZeit(), 0.0);
        assertEquals(130.0, andreiMarutaUser.kalkuliereZeit(new Fussball()), 0.0);
        assertEquals(51.25, andreiMarutaUser.kalkuliereDurschnittzeit(), 0.0);
        assertEquals(55.0, andreiMarutaUser.kalkuliereZeit(new Basketball()), 0.0);
        assertEquals(20.0, andreiMarutaUser.kalkuliereZeit(new Hochsprung()), 0.0);
        assertEquals(0, andreiMarutaUser.kalkuliereZeit(new Hindernislauf()), 0.0);



    }


}
