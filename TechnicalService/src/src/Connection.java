package src;

import java.util.Map;
import org.jpl7.Query;
import org.jpl7.Term;

/**
 *
 * @author Gamaliel Bernal
 */
public class Connection {

    public static void main(String args[]) {
        System.out.println(Conn());
        Results();
    }

    public void Connection() {

    }

    public static String Conn() {
        // Consulting file.
        String path = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/expertsystem.pl')";
        String path2 = "consult('C:/Users/GamalielJakousi/Documents/GitHub/Prolog/TechnicalService/src/src/knowledgebase.pl')";
        Query q1 = new Query(path);
        Query q2 = new Query(path2);
        // Message.
        return "consult KnowlegdeBase: " + " " + (q2.hasSolution() ? "true" : "false")
                + "\nconsult ExpertSystem: " + " " + (q1.hasSolution() ? "true" : "false");
    }

    public static void Results() {
        Query query = new Query("consulta.");

        while (query.hasMoreSolutions()) {
            Map<String, Term> solution = query.nextSolution();
            System.out.println("uno");
        }

//        java.util.Map<String, Term>[] solutions = query.allSolutions();
//        for (int i = 0; i < solutions.length; i++) {
//            System.out.println("X = " + solutions[i].get("X"));
//        }
        //java.util.Map<String, Term> solution;
        //solution = query.oneSolution();
    }
}
