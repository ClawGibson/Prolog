package src;

import org.jpl7.Query;

/**
 *
 * @author Gamaliel Bernal
 */
public class Connection {

    public static void main(String[] args) {
        // Consulting file.
        String t1 = "consult(‘archivo.pl’)";
        Query q1 = new Query(t1);
        // Message.
        System.out.println(t1 + " " + (q1.hasSolution() ? "true" : "false"));
    }
}
