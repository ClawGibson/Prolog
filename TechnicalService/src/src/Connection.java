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

        /**
         * Debe de consultarse la base de conocimiento primero para que el
         * sistema experto la conozca y pueda realizar las consultas.
         */
        // Consulting files.
        String path1 = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/expertsystem.pl')";
        String path2 = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/knowledgebase.pl')";
        String result;

        Query q2 = new Query(path2), q1 = new Query(path1);
        // Message.
        if (q1.hasSolution() && q2.hasSolution()) {
            result = "consult KnowledgeBase: " + " " + (q2.hasSolution() ? "true" : "false")
                    + "\nconsult ExpertSystem: " + " " + (q1.hasSolution() ? "true" : "false");
            return result;
        } else {
            return "Error en la conexión";
        }
    }
}
