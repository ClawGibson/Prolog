package src;

import org.jpl7.Query;

/**
 *
 * @author Gamaliel Bernal
 */
public class Connection {

    public void Connection() {

    }

    public static String Conn() {
        // Consulting file.
        String path = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/knowledgebase.pl')";
        Query query = new Query(path);
        // Message.
        return "consult KnowlegdeBase: " + " " + (query.hasSolution() ? "true" : "false");
    }
}
