package src;

import org.jpl7.Query;

/**
 *
 * @author Gamaliel Bernal
 */
public class Connection {

    public void Connection() {

    }

    public String Conn() {
        // Consulting file.
        String path = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/expertsystem.pl')";
        Query q1 = new Query(path);
        // Message.
        //System.out.println("consult:" + " " + (q1.hasSolution() ? "true" : "false"));
        return "consult ExpertSystem: " + " " + (q1.hasSolution() ? "true" : "false");
    }
}
